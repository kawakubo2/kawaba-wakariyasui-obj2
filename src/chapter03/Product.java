package chapter03;

import java.time.LocalDate;

public class Product {
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
    public Product(String number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = LocalDate.now();
        this.stock = true;
    }
    public Product(String fileName) {
    }
    public Product() {}
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public boolean isStock() {
        return stock;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
                + stock + "]";
    }
    
}
