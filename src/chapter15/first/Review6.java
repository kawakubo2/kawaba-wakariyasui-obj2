package chapter15.first;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class Review6 {
    public static void main(String[] args) {
        String path = "books.dat";
        try (ObjectInputStream in
            = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            System.out.printf(in.readLong() + "\t" + in.readUTF() + "\t" + (LocalDate)in.readObject() + "\n");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
