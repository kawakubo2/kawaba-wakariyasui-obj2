package chapter07.p11;

public class Sub11Test2 {
    public static void main(String[] args) {
        Sub11 sub1 = new Sub11("Hello");
        Sub11 sub2 = new Sub11("World");
        print(sub1, sub2);
    }
    public static void print(Sub11 sub1, Sub11 sub2) {
        sub1.printStr(sub2);
    }
}
