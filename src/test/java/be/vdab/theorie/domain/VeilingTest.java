package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VeilingTest {

    @Test
    void zonderBodIsHetHoogsteBod0() {
        assertThat(new Veiling().getHoogsteBod()).isEqualByComparingTo("0");
    }

    @Test
    void met1BodVan100IsHetHoogsteBod100() {
        var veiling= new Veiling();
        veiling.doeBod(BigDecimal.valueOf(100));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("100");
    }

    @Test
    void metmeerdereBodenVanIsHetHoogsteBod() {
        var veiling= new Veiling();
        veiling.doeBod(BigDecimal.valueOf(1000));
        veiling.doeBod(BigDecimal.valueOf(2000));
        veiling.doeBod(BigDecimal.valueOf(3000));
        veiling.doeBod(BigDecimal.valueOf(1000));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("3000");
    }


}