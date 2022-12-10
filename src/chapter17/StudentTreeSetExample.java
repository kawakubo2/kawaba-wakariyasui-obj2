package chapter17;

import java.util.TreeSet;

record Student(int id, String name) implements Comparable<Student> {
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}
public class StudentTreeSetExample {
    public static void main(String[] args) {
        var students = new TreeSet<Student>();
        students.add(new Student(130, "田中宏"));
        students.add(new Student(100, "井上幸三"));
        students.add(new Student(120, "佐藤次郎"));

        for (Student s: students) {
            System.out.println(s);
        }
    }
}
