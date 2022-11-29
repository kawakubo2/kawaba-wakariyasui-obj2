package chapter04.sample2;

import java.time.LocalDate;

// classにfinal修飾すると継承させないという意味になる
public final class Product {
    private final String number; // 2度目以降の代入はできない
    private final String name;
    private final int price;
    private final LocalDate date;
    private final boolean stock;
    public Product(String number, String name, int price, LocalDate date, boolean stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stock = stock;
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public LocalDate getDate() {
        return date;
    }
    public boolean isStock() {
        return stock;
    }
    @Override
    public String toString() {
        return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
                + stock + "]";
    }
}
