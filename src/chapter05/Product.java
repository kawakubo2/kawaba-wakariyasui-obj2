package chapter05;

public record Product(String code, String name, int price, boolean shortage) {
    // Q5-3
    public Product(String code, String name, int price) {
        this(code, name, price, false);
    }
}
