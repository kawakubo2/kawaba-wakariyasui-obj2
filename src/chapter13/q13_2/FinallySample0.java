package chapter13.q13_2;

import lib.Input;

public class FinallySample0 {
    public static void main(String[] args) {
        int a = Input.getInt();
        int b = Input.getInt();
        try {
            int ans = div(a, b);
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static int div(int a, int b) {
        try {
            return a / b;
        } catch(ArithmeticException e) {
            System.out.println("ゼロ除算");
            throw e;
        } finally {
            System.out.println("finally");
        }
    } 
}
