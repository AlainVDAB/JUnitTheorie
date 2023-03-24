package be.vdab.theorie.domain;

public class Woord {
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public boolean isPalindroom() {
        StringBuilder spiegelbeeld = new StringBuilder();
        StringBuilder beeld = new StringBuilder();
        for (var i = 0; i <= woord.length() / 2; i++) {
            spiegelbeeld.append(woord.toLowerCase().charAt(woord.length() - 1 - i));
            beeld.append(woord.toLowerCase().charAt(i));
        }
        return beeld.toString().equals(spiegelbeeld.toString());
    }
}
