package be.vdab.theorie.services;

import be.vdab.theorie.repositories.PersoonRepository;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PersoonService {
    private final PersoonRepository repository;
    public PersoonService(PersoonRepository repository) {
        this.repository = repository;
    }
    public BigDecimal standaardAfwijkingWeddes() {
        var weddes = repository.findAllWeddes();
        var totaal = weddes.stream()
.reduce(BigDecimal.ZERO, (vorigTotaal, huidigeWedde) ->
                vorigTotaal.add(huidigeWedde));
        var gemiddelde =
                totaal.divide(BigDecimal.valueOf(weddes.size()), 2, RoundingMode.HALF_UP);
        totaal = weddes.stream()
                .map(wedde -> wedde.subtract(gemiddelde))
                .map(verschil -> verschil.pow(2))
                .reduce(BigDecimal.ZERO, (vorigTotaal, huidigKwadraat) ->
                        vorigTotaal.add(huidigKwadraat));
        var variantie =
                totaal.divide(BigDecimal.valueOf(weddes.size()), 2, RoundingMode.HALF_UP);
        var standaardAfwijking =
                BigDecimal.valueOf(Math.sqrt(variantie.doubleValue()));
        return standaardAfwijking;
    }
}
