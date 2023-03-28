package be.vdab.taken.services;

import be.vdab.taken.repositories.WoonplaatsRepository;

public class WoonplaatsService {
    private final WoonplaatsRepository repository;
    public WoonplaatsService(WoonplaatsRepository repository) {
        this.repository = repository;
    }
    public long maxAantalStreepjesInEenWoonplaats() {
        return repository.findMetStreepjes()
                .stream()
                .map(woonplaats->woonplaats.chars().filter(eenChar->eenChar=='-').count())
                .max(Long::compare)
                .orElse(0l);
    }
}
