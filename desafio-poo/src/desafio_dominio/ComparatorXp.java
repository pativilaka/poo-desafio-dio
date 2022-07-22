package desafio_dominio;

import java.util.Comparator;
import java.util.Map;

public class ComparatorXp implements Comparator <Map.Entry<String, Dev>> {
    @Override
    public int compare(Map.Entry<String, Dev> o1, Map.Entry<String, Dev> o2) {
        return o1.getValue().getPositionXp().compareTo(o2.getValue().getPositionXp());
    }
}
