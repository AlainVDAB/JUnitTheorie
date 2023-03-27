package be.vdab.theorie.domain;

import java.util.Objects;

public class Rechthoek {
    private int lengte;
    private int breedte;

    public Rechthoek(int lengte, int breedte) {
        if (lengte > 0) {
            this.lengte = lengte;
        }
        if (breedte > 0) {
            this.breedte = breedte;
        }
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
