package chapter20.second;

import java.util.List;

import chapter20.first.Department;

public class FlatmapExample {
    public static void main(String[] args) {
        var list = Department.getList();

        List<String> employees = list.stream()
                                    .map(Department::employees)
                                    .flatMap(List::stream)
                                    .toList();
        employees.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
