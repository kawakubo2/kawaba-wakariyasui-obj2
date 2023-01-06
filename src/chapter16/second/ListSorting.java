package chapter16.second;

import java.util.ArrayList;
import java.util.Comparator;

record Student(int id, String name) {}

public class ListSorting {
    public static void main(String[] args) {
        var list = new ArrayList<Student>();
        list.add(new Student(103, "たなか"));
        list.add(new Student(101, "きむら"));
        list.add(new Student(102, "いのうえ"));

        System.out.println("---< id順にソート >---");
        list.sort(Comparator.comparing(Student::id));
        for (Student s: list) {
            System.out.println(s);
        }

        System.out.println("---< 名前順にソート >---");
        list.sort(Comparator.comparing(Student::name));
        for (Student s: list) {
            System.out.println(s);
        }

    }
}
