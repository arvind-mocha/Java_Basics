package Demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Arvind");
        map.put("actor", "Surya");
        map.put("ceo", "Sundar");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
