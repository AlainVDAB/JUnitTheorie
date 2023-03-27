package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RechthoekTest {

    @Test
    void l4b8IsEenRechthoek() {
        assertThat(new Rechthoek(4,8).getOppervlakte()).isEqualTo(32);
    }

    @Test
    void l6b6IsEenRechthoek() {
        assertThat(new Rechthoek(6,6).getOppervlakte()).isEqualTo(36);
    }

    @Test
    void l0b10IsEenRechthoek() {
        assertThat(new Rechthoek(0,10).getOppervlakte()).isEqualTo(0);
    }

    @Test
    void rechthoekenMetDezelfdeAfmetingenZijGelijk() {
        assertThat(new Rechthoek(4,5)).isEqualTo(new Rechthoek(4,5));
    }

    @Test
    void rechthoekenMetAndereAfmetingenZijnNietGelijk() {
        assertThat(new Rechthoek(4,5)).isNotEqualTo(new Rechthoek(5,4));
    }
    @Test
    void deHashCodeVanGelijkeRechthoekenIsGelijk() {
        assertThat(new Rechthoek(5,8)).hasSameHashCodeAs(new Rechthoek(5,8));
    }

}
