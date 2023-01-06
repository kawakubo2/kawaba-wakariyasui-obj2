package chapter17.first;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        var ids = new LinkedHashSet<String>();
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
