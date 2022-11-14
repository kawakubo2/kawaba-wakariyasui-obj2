package chapter07.p3;

public class SubTest {
    public static void main(String[] args) {
        Sub sub1 = new Sub();
        Sub sub2 = new Sub();
        sub1.print(sub2);
        sub1.print(sub1);
        sub2.print(sub2);
        sub2.print(sub1);
    }
}
