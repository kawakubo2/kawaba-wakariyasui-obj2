package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

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
    public Product(String fileName) throws IOException, IllegalArgumentException {
        Path path = Paths.get(fileName);
        try (BufferedReader in = Files.newBufferedReader(path);) {
            String temp = in.readLine();
            String[] strArray = temp.split(",");
            if (strArray.length != 5) {
                throw new IllegalArgumentException("ファイル形式が異なります。");
            }
            this.number = strArray[0];
            this.name = strArray[1];
            this.price = Integer.parseInt(strArray[2]);
            List<Integer> intArray = Arrays.stream(strArray[3].split("-"))
                                            .map(Integer::parseInt) 
                                            .toList();
            this.date = LocalDate.of(intArray.get(0), intArray.get(1), intArray.get(2));
            this.stock = "1".equals(strArray[4]) ? true : false;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
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
