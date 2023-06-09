package be.vdab.theorie.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Artikel {
    private BigDecimal prijsExclusiefBtw;
    private BigDecimal btwPercentage;

    public Artikel(BigDecimal prijsExclusiefBtw, BigDecimal btwPercentage) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.btwPercentage = btwPercentage;
    }

    public BigDecimal getPrijsInclusiefBtw(){
        return prijsExclusiefBtw.multiply(BigDecimal.ONE.add(btwPercentage)).setScale(2, RoundingMode.HALF_UP);

    }
}
