package be.vdab.theorie.repositories;

import be.vdab.theorie.exceptions.RepositoryException;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PersoonRepository {
    public List<BigDecimal> findAllWeddes() {
        try (var stream = Files.lines(Path.of("/data/personen.csv"))) {
            return stream
// regel splitsen in onderdelen, 4° onderdeel omzetten naar BigDecimal:
                    .map(regel -> new BigDecimal(regel.split(",")[3]))
                    .toList();
        } catch (IOException ex) {
            throw new RepositoryException(ex);
        }
    }
}
