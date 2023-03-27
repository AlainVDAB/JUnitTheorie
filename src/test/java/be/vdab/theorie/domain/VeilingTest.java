package be.vdab.theorie.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VeilingTest {
    private Veiling veiling;

@BeforeEach
void beforeEach(){
    veiling= new Veiling();
}

    @Test
    void zonderBodIsHetHoogsteBod0() {

        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("0");
    }

    @Test
    void met1BodVan100IsHetHoogsteBod100() {

        veiling.doeBod(BigDecimal.valueOf(100));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("100");
    }

    @Test
    void metmeerdereBodenVanIsHetHoogsteBod() {

        veiling.doeBod(BigDecimal.valueOf(1000));
        veiling.doeBod(BigDecimal.valueOf(2000));
        veiling.doeBod(BigDecimal.valueOf(3000));
        veiling.doeBod(BigDecimal.valueOf(1000));
        assertThat(veiling.getHoogsteBod()).isEqualByComparingTo("3000");
    }


}