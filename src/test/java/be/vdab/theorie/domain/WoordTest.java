package be.vdab.theorie.domain;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class WoordTest {

    @Test
    void lepelIsEenPalindroom() {
        assertThat(new Woord("lepel").isPalindroom()).isTrue();
    }

    @Test
    void droommoordIsEenPalindroom() {
        assertThat(new Woord("Droommoord").isPalindroom()).isTrue();
    }

    @Test
    void alainIsGeenPalindroom() {
        assertThat(new Woord("Alain").isPalindroom()).isFalse();
    }




}
