package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class RechthoekTest {

    @Test
    void l4b8IsEenRechthoek() {
        assertThat(new Rechthoek(8,4).getOppervlakte()).isEqualTo(32);
    }

    @Test
    void l6b6IsEenRechthoek() {
        assertThat(new Rechthoek(6,6).getOppervlakte()).isEqualTo(36);
    }

    @Test
    void l0b10IsEenRechthoek() {
        assertThat(new Rechthoek(10,0).getOppervlakte()).isEqualTo(0);
    }

    @Test
    void rechthoekenMetDezelfdeAfmetingenZijGelijk() {
        assertThat(new Rechthoek(5,4)).isEqualTo(new Rechthoek(5,4));
    }

    @Test
    void rechthoekenMetAndereAfmetingenZijnNietGelijk() {
        assertThat(new Rechthoek(5,4)).isNotEqualTo(new Rechthoek(6,4));
    }
    @Test
    void deHashCodeVanGelijkeRechthoekenIsGelijk() {
        assertThat(new Rechthoek(8,5)).hasSameHashCodeAs(new Rechthoek(8,5));
    }

    @Test
    void eenLengteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(
                ()-> new Rechthoek(-1,5)
        );
    }

    @Test
    void eenBreedteMagNietNegatiefZijn() {
        assertThatIllegalArgumentException().isThrownBy(
                ()-> new Rechthoek(5,-1)
        );
    }
}
