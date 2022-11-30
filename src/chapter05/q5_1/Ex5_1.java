package chapter05.q5_1;

import lib.Input;

public class Ex5_1 {
    public static void main(String[] args) {
        double weight = Input.getDouble("体重: ");
        double height = Input.getDouble("身長: ");
        HelthCheck hc = new HelthCheck(weight, height);
        System.out.println("標準体重 = " + hc.stdWeight());
        System.out.println("BMI指標 = " + hc.bmi());
    }
}
