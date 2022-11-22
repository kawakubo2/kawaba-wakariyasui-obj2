package chapter02.sample;

import java.time.LocalDate;

public class Product {
    // フィールド変数
    private String number;
    private String name;
    private int price;
    private LocalDate date;
    private boolean stock;
    public Product(String number, String name, int price, LocalDate date, boolean stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stock = stock;
    }
    // アクセサメソッド
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public boolean isStock() {
        return this.stock;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }
    public int totalPrice(int quantity) {
        return price * quantity;
    }
    public boolean isHighPrice(Product other) {
        return this.price > other.price;
    }
    @Override
    public String toString() {
        return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
                + stock + "]";
    }
}
