package be.vdab.theorie.domain;

import java.util.regex.Pattern;

public class Isbn {
    private static final Pattern PATTERN =
            Pattern.compile("^(\\d{3})(\\d{9})(\\d)$");
    private int contoleGetalOneven;
    private int contoleGetalEven;
    private long nummer;

    public Isbn(long nummer) {
        var matcher = PATTERN.matcher(String.valueOf(nummer));
        if ( ! matcher.matches()) {
            throw new IllegalArgumentException("Verkeerd formaat");
        }
        if ( 978 != Integer.parseInt(matcher.group(1))&979 != Integer.parseInt(matcher.group(1))) {
            throw new IllegalArgumentException("Eerste 3 cijfers niet correct");
        }

        for(var i=0; i<=10;i=i+2){
            contoleGetalOneven+= Integer.parseInt(String.valueOf(String.valueOf(nummer).charAt(i)));
            //System.out.println(Integer.parseInt(String.valueOf(String.valueOf(nummer).charAt(i))));
        }
        for(var i=1; i<=11;i=i+2){
            contoleGetalEven+= Integer.parseInt(String.valueOf(String.valueOf(nummer).charAt(i)))*3;
        }
        var testGetal= 10-((contoleGetalEven+contoleGetalOneven)%10);
        if(testGetal==10){testGetal=0;}

        //System.out.println(nummer + " testgetal= " + testGetal + " even " + contoleGetalEven + " oneven " +contoleGetalOneven);

        if(Integer.parseInt(matcher.group(3))!=testGetal){
            throw new IllegalArgumentException("De getallen in het opgegeven nummer kloppen niet");
        }
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return String.valueOf(nummer);
    }
}
