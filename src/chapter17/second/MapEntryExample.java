package chapter17.second;

import java.util.HashMap;
import java.util.Map;

public class MapEntryExample {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();
        map.put(115, "田中");
        map.put(120, "木村");
        map.put(108, "佐藤");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("Entryがないバージョンでの取り出し方");
        for (Integer num: map.keySet()) {
            System.out.println(num + " = " + map.get(num));
        }

    }
}
