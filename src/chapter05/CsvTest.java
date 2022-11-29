package chapter05;

public class CsvTest {
    public static void main(String[] args) {
        String member = "180.0,92.5,福岡県,38";
        Csv csv = new Csv(member);
        System.out.println("身長:" + csv.getDouble(0));
        System.out.println("体重:" + csv.getDouble(1));
        System.out.println("都道府県:" + csv.get(2));
        System.out.println("年齢:" + csv.getInt(3));
    }
}
