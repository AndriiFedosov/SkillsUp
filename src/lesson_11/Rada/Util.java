package lesson_11.Rada;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

    public Map<String, Partia> getBribeToAllDeputy(Map<String, Partia> rada) {
        Set<String> keys = rada.keySet();
        for (String key : keys) {
            if (key.equals("oposition")){
                List<Deputy> deputies = rada.get(key)
                        .getDeputies()
                        .stream()
                        .peek(deputy -> deputy.setBribeTaker(true))
                        .collect(Collectors.toList());
                rada.put(key, new Partia(deputies));
            }
        }
        return rada;
    }
    public Map<String, Partia> removePartyIfAllAreBibeTakers(Map<String, Partia> rada){
        Set<String> keys = rada.keySet();
        List<String> partyNameWhereAllIsBribers =new ArrayList<>();
        for (String key : keys) {
            boolean inPartyIsAllBibered = rada.get(key)
                    .getDeputies()
                    .stream()
                    .allMatch(Deputy::isBribeTaker);
            if (inPartyIsAllBibered){
                partyNameWhereAllIsBribers.add(key);
            }
        }
        for (String key: partyNameWhereAllIsBribers){
            rada.remove(key);
        }
        return  rada;
    }
}
