package chapter21.second;

import java.util.List;
import static java.util.stream.Collectors.*;

import chapter20.first.Department;

public class JoiningExample {
    public static void main(String[] args) {
        var list = Department.getList();

        String employees = list.stream()
            .map(Department::employees)
            .flatMap(List::stream)
            .collect(joining(", "));
        System.out.println(employees);
    }
}
