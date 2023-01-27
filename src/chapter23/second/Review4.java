package chapter23.second;

public class Review4 {
    public static void main(String[] args) {
        String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).{6,}$";
        String[] ok = {"A1b2c3", "123ABcd", "12xxZZ", "AB123cc!!", "@@AB1zz2", "あいうAb12" };
        String[] ng = {" SB001z ", "1BA zyx", "a    b   A   1", "Ab1"};
        RegExpUtil.test(pattern, ok, true);
        RegExpUtil.test(pattern, ng, false);
    }
}
