package be.vdab.theorie.repositories;

import be.vdab.taken.exceptions.RepositoryException;
import be.vdab.taken.repositories.WoonplaatsRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class WoonplaatsRepositoryStub extends WoonplaatsRepository {

    @Override
    public List<String> findMetStreepjes() {
        return Stream.of("Gent","Sint-Niklaas","Sint-Laureins","Maldegem","Heist-op-den-Berg")
                .filter(woonplaats->woonplaats.contains("-"))
                .toList();

    }

}
