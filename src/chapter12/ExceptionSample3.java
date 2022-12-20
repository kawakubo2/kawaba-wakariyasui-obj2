package chapter12;

import lib.Input;

public class ExceptionSample3 {
    public static void main(String[] args) {
        int a = Input.getInt();
        int b = Input.getInt();

        try {
            int ans = div(a, b);
            System.out.println(a + "÷" + b + "=" + ans);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("divメソッドの第2引数が0");
        }
        return a / b;
    }
}
