package chapter15.first;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Review5 {
    public static void main(String[] args) {
        String path = "books.dat";
        try (ObjectOutputStream out =
            new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)))) {
            out.writeLong(1234567890123L);
            out.writeUTF("プログラマのための健康法");
            out.writeObject(LocalDate.of(2020, 1, 15));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
