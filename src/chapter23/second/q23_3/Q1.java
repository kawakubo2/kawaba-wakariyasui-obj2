package chapter23.second.q23_3;

import lib.Input;

public class Q1 {
    public static void main(String[] args) {
        String item = Input.getString("製品番号");
        if (!item.matches("^(?=.*[A-Z0-9])(?!.*[a-z])(?!.*\\W).{4,6}$")) {
            System.out.println(item);
        }
    }
}
