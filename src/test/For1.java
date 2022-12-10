package test;

public class For1 {
    public static void main(String[] args) {
        String[] w = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }

        for (String s: w) {
            System.out.println(s);
        }
    }
}
