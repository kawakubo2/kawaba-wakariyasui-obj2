package chapter21;

import java.util.OptionalDouble;
import java.util.OptionalInt;

import chapter20.PC;

public class CalculateExamle {
    public static void main(String[] args) {
        var list = PC.getList();
        // 件数
        long count = list.stream().count();
        // 合計
        int sum = list.stream()
                .mapToInt(PC::price)
                .sum();
        // 平均
        OptionalDouble avg = list.stream()
                .mapToInt(PC::price)
                .average();
        // 最大
        OptionalInt max = list.stream()
                .mapToInt(PC::price)
                .max();
        // 最小
        OptionalInt min = list.stream()
                .mapToInt(PC::price)
                .min();

        System.out.println("件数: " + count);
        System.out.println("合計: " + sum);
        System.out.println("平均: " + avg.getAsDouble());
        System.out.println("最大: " + max.getAsInt());
        System.out.println("最小: " + min.getAsInt());
    }
}
