package chapter18.first.q18_1_b;

public class MyBiFunctionTest {
    public static void main(String[] args) {
        try {
            MyBiFunction func = new MyBiFunction();
            System.out.println(func.apply(1, new Member(1234, "田中宏")));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
