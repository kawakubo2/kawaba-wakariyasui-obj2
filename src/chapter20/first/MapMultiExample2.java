package chapter20.first;

public class MapMultiExample2 {
    public static void main(String[] args) {
        var list = Department.getList();
        list.stream()
                .<String>mapMulti((dep, buffer) -> {
                    for (String name : dep.employees()) {
                        buffer.accept(name);
                    }
                })
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
