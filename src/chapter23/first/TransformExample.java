package chapter23.first;

import chapter05.Csv;

record User(int id, String name) {}

public class TransformExample {
    public static void main(String[] args) {
        String str = "2025, 田中宏";
        User user = str.transform(s -> {
            var csv = new Csv(s);
            return new User(csv.getInt(0), csv.get(1));
        });
        System.out.println(user);
    }
}
