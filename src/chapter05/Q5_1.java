package chapter05;

import lib.Input;

public class Q5_1 {
    public static void main(String[] args) {
        Health health = new Health(Input.getDouble("体重"), Input.getDouble("身長"));
        System.out.printf("標準体重: %.1fkg%n", health.getStandardWeight());
        System.out.printf("BMI値: %.1f%n", health.getBmi());
    }
}
