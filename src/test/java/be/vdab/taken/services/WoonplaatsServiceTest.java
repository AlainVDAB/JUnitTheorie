package be.vdab.taken.services;

import be.vdab.taken.repositories.WoonplaatsRepository;
import be.vdab.theorie.repositories.WoonplaatsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class WoonplaatsServiceTest {
    private WoonplaatsService service;
    @BeforeEach
    void beforeEach() {
        service = new WoonplaatsService(new WoonplaatsRepositoryStub());
    }
    @Test
    void maxAantalStreepjesInEenWoonplaats() {
        assertThat(
                service.maxAantalStreepjesInEenWoonplaats()).isEqualTo(3);

}}