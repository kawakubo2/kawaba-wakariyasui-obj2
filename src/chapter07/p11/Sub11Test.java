package chapter07.p11;

public class Sub11Test {
    public static void main(String[] args) {
        Sub11 sub1 = new Sub11("xxx");
        Sub11 sub2 = new Sub11("yyy");
        sub1.print(sub2);
        sub1.print(sub1);
        sub2.print(sub2);
        sub2.print(sub1);
        sub1.printStr(sub2);
        sub1.printStr(sub1);
        sub2.printStr(sub2);
        sub2.printStr(sub1);
    }
}
