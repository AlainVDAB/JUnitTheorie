package be.vdab.theorie.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IsbnTest {

    @Test
    void isbn9789027439642IsCorrect() {
        new Isbn(9789027439642l);
    }

    @Test
    void isbn9782765409120IsCorrect() {
        new Isbn(9782765409120l);
    }

    @Test
    void isbn9889012345677DeEersteCijfersZijnNietCorrect() {
        assertThatIllegalArgumentException().isThrownBy(()->new Isbn(9889012345677l));
    }

    @Test
    void isbn97890123456IsTeKort() {
        assertThatIllegalArgumentException().isThrownBy(()->new Isbn(97890123456l));
    }
    @Test
    void isbn97890123456778IsTeLang() {
        assertThatIllegalArgumentException().isThrownBy(()->new Isbn(97890123456778l));
    }

    @Test
    void isbn9789012345677IsNietCorrect() {
        assertThatIllegalArgumentException().isThrownBy(()->new Isbn(9789012345677l));
    }

    @Test
    void hetNummer0IsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Isbn(0));
    }
    @Test
    void eenNegatiefNummerIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(-9789027439642L));
    }
    @Test
    void eenNummerMet14CijfersIsVerkeerd() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(97890274396421L));
    }
    @Test
    void deEerste3CijfersMoeten978of979Zijn() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(9779227439643L));
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal2() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(8789027439642L));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal2() {
        new Isbn(9789027439642L);
    }
    @Test
    void eenNummerMet13CijfersMetVerkeerdControleGetal3() {
        assertThatIllegalArgumentException().isThrownBy(
                () -> new Isbn(9789027439643L));
    }
    @Test
    void eenNummerMet13CijfersMetCorrectControleGetal0() {
        new Isbn(9789227439640L);
    }
    @Test
    void toStringMoetHetNummerTeruggeven() {
        assertThat(new Isbn(9789227439640L)).hasToString("9789227439640");
    }
}