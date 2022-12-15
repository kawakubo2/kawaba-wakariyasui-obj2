package chapter20.first;

public class FilterExample {
    public static void main(String[] args) {
        var list = PC.getList();
        final var maker = "Panan";
        list.stream()
                .filter(pc -> maker.equals(pc.maker()))
                .forEach(System.out::println);
    }
}
