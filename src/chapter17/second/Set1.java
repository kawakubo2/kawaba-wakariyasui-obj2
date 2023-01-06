package chapter17.second;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    // 和集合
    public static Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
        var result = new HashSet<Integer>();
        for (Integer i: s1) {
            result.add(i);
        }
        for (Integer i: s2) {
            result.add(i);
        }
        return result;
    }
    // 積集合
    public static Set<Integer> intersect(Set<Integer> s1, Set<Integer> s2) {
        var result = new HashSet<Integer>();
        for (Integer i: s1) {
            if (s2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    // 差集合
    public static Set<Integer> except(Set<Integer> s1, Set<Integer> s2) {
        var result = new HashSet<Integer>();
        for (Integer i: s1) {
            if (!s2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
