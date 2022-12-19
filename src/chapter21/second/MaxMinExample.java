package chapter21.second;

import java.util.Comparator;
import java.util.Optional;

import chapter20.first.PC;

public class MaxMinExample {
    public static void main(String[] args) {
        var list = PC.getList();

        Optional<PC> min = list.stream()
            .min(Comparator.comparing(PC::price));
    
        Optional<PC> max = list.stream()
            .max(Comparator.comparing(PC::price));

        System.out.println("最安値=" + min.get());
        System.out.println("最高値=" + max.get());
    }
}
