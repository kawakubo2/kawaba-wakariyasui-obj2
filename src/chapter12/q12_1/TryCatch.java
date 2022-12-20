package chapter12.q12_1;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int n = count();
            System.out.println(n);
        } catch (NullPointerException e) {
            System.out.println("エラーが発生しました");
        }
    }
    public static int count() throws NullPointerException {
        // もろもろの処理
        throw new NullPointerException();
    }
}
