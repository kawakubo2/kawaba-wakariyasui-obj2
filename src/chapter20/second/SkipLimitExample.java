package chapter20.second;

import java.util.List;

import chapter20.first.PC;
import static java.util.Comparator.*;

public class SkipLimitExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> limitedPCs = list.stream()
                                .sorted(comparing(PC::price))
                                .skip(3)
                                .limit(3)
                                .toList();
        limitedPCs.forEach(System.out::println);
    }
}
