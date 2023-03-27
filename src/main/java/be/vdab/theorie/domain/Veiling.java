package be.vdab.theorie.domain;

import java.math.BigDecimal;

public class Veiling {

    private BigDecimal hoogsteBod=BigDecimal.ZERO;
    public void doeBod(BigDecimal bod){
        if (bod.compareTo(hoogsteBod)>0){
            hoogsteBod=bod;
        }
    }

    public BigDecimal getHoogsteBod(){
        return hoogsteBod;
    }


}
