package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtikelTest {

    @Test
    void eenArtikelMetPrijs1is1Komma21InclciefBtw() {
        assertThat(new Artikel(BigDecimal.ONE, BigDecimal.valueOf(0.21)).getPrijsInclusiefBtw()).isEqualByComparingTo("1.21")
                ;
    }

    @Test
    void eenArtikelMetPrijs0is0InclciefBtw() {
        assertThat(new Artikel(BigDecimal.ZERO, BigDecimal.valueOf(0.21)).getPrijsInclusiefBtw()).isEqualByComparingTo("0")
        ;
    }

    @Test
    void eenArtikelMetPrijs88is106komma48InclciefBtw() {
        assertThat(new Artikel(BigDecimal.valueOf(88), BigDecimal.valueOf(0.21)).getPrijsInclusiefBtw()).isEqualByComparingTo("106.48")
        ;
    }
}
