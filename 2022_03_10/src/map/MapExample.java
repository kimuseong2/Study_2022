package map;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();

        map.put("kicker1","박지성");
        map.put("kicker2","손흥민");

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();

            System.out.println("map.key = " + key);
            System.out.println("map.value = " + map.get(key));
        }



    }


}
