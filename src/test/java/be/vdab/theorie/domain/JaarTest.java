package be.vdab.theorie.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class JaarTest {
    @Test
    void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
        var jaar = new Jaar(2000);
        assertThat(jaar.isSchrikkeljaar()).isTrue();
    }

    @Test
    void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
        assertThat(new Jaar(1900).isSchrikkeljaar()).isFalse();
    }
    @Test
    void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
        assertThat(new Jaar(2012).isSchrikkeljaar()).isTrue();
    }
    @Test
    void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
        assertThat(new Jaar(2015).isSchrikkeljaar()).isFalse();
    }

    @Test
    void toStringGeeftHetJaarAlsTekst() {
        assertThat(new Jaar(2015).toString()).isEqualTo("2015");
    }

    @Test
    void jarenMetHetzelfdeJaartalZijnGelijk() {
        assertThat(new Jaar(2015)).isEqualTo(new Jaar(2015));
    }
    @Test
    void jarenMetEenVerschillendJaartalZijnVerschillend() {
        assertThat(new Jaar(2015)).isNotEqualTo(new Jaar(2016));
    }

    @Test
    void deHashCodeVanGelijkeJarenIsGelijk() {
        assertThat(new Jaar(2015)).hasSameHashCodeAs(new Jaar(2015));
    }
}
