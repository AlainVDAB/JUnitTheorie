package be.vdab.theorie.domain;

import java.util.Objects;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) {
        if (lengte < 0 ) {
           throw new IllegalArgumentException("Een lengte mag niet negatief zijn.");
        }
        if (breedte < 0 ) {
            throw new IllegalArgumentException("Een breedte mag niet negatief zijn.");
        }
        if (lengte < breedte ) {
            throw new IllegalArgumentException("Een lengte kan niet kleiner zijn dan een breedte");
        }
        this.lengte=lengte;
        this.breedte=breedte;


    }

    public int getOppervlakte() {
        return lengte * breedte;
    }

    public int getOmtrek() {
        return (lengte + breedte) * 2;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Rechthoek andereRechthoek && lengte == andereRechthoek.lengte && breedte==andereRechthoek.breedte;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengte, breedte);
    }

}
