package chapter20.second;

import chapter20.first.Department;

public class MapMultiExample3 {
    public static void main(String[] args) {
        var list = Department.getList();

        list.stream()
            .<String>mapMulti((dep, buffer) -> {
                dep.employees().forEach(buffer::accept);
            })
            .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
