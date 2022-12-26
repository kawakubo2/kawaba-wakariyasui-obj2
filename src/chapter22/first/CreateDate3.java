package chapter22.first;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreateDate3 {
    public static void main(String[] args) {
        String[] strArray = {
            "2022-12-26", "2023-01-02",
            "2023-1-3", "2023-1-04", "2023-01-5",
            "2022/12/26", "2023/01/02",
            "2023/1/3", "2023/1/04", "2023/01/5",
            "2022.12.26", "2023.01.02",
            "2023.1.3", "2023.1.04", "2023.01.5",
        };
        List<LocalDate> list = new ArrayList<>();
        for (String s: strArray) {
            list.add(MyLocalDate.parse(s));
        }
        list.forEach(System.out::println);
    }
}
