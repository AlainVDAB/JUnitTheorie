package be.vdab.theorie.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Statistiek {
    public static BigDecimal getGemiddelde(BigDecimal[] getallen){
        if (getallen.length == 0) {
            throw new IllegalArgumentException("Lege array");
        }
        return Arrays.stream(getallen)
                .reduce(BigDecimal.ZERO, (vorigTotaal, getal) -> vorigTotaal.add(getal))
                .divide(BigDecimal.valueOf(getallen.length));
    }

}
