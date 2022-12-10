package chapter17;

import java.util.HashSet;

public class Q17_1_2 {
    public static void main(String[] args) {
        var numbers = new HashSet<Integer>();
        numbers.add(250);
        numbers.add(410);
        numbers.add(75);
        numbers.add(135);
        numbers.add(201);
        for (int n: numbers) {
            System.out.println(n);
        }
    }
}
