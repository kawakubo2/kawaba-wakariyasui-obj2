package chapter05.sample3;

public class IdNumber {
    private int number;
    public IdNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "IdNumber [number=" + number + "]";
    }
}
