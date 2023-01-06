package chapter17.first;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        var ids = new HashSet<String>();
        ids.add("アンパンマン");
        ids.add("スーパーマン");
        ids.add("バットマン");
        ids.add("スパイダーマン");
        ids.add("バットマン");

        for (String id: ids) {
            System.out.println(id);
        }
    }
}
