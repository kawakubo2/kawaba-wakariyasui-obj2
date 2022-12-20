package chapter13.q13_2;

public class Ex2 {
    public static void main(String[] args) {
        try {
            color("yellow");
        } catch (BadColorException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void color(String color) throws BadColorException {
        try {
            if (!("red".equals(color) || "green".equals(color) || "blue".equals(color))) {
                throw new BadColorException("★不正な色です");
            }
            System.out.println(color);
        } catch (BadColorException e) {
            // logファイルへ出力
            e.printStackTrace();
            throw e; // 再スロー(rethrow)
        }
    }
}
