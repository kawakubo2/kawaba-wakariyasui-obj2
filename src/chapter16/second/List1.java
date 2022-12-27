package chapter16.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(40);
        numbers.add(28);
        System.out.println("合計:" + sum(numbers));
    }
    public static int sum(List<Integer> nums) {
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }
        return sum;
    }
}
