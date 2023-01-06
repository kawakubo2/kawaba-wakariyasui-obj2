package chapter17.second;

import java.util.Set;

public class Set1Test {
    public static void main(String[] args) {
        var set1 = Set.of(2, 4, 6, 8, 10, 12, 14, 16);
        var set2 = Set.of(1, 2, 4, 8, 16, 32, 64);

        System.out.println("和集合: " + Set1.union(set1, set2));
        System.out.println("積集合: " + Set1.intersect(set1, set2));
        System.out.println("差集合: " + Set1.except(set1, set2));
    }
}
