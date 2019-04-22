package lesson_11.Rada;

import java.util.Map;
import java.util.Set;

public class Util {
    public void takeBribe(Map<String, Partia> rada, String name) {
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputy : entry) {
            for (Deputy deputy : nameOfDeputy.getValue().getDeputies()) {
                if (deputy.getName().equals(name)) {
                    deputy.setBribeTaker(true);
                }
            }
        }

    }
}
