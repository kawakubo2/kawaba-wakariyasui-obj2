package chapter17;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        var ids = new TreeSet<String>();
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
