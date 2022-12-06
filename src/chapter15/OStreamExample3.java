package chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class OStreamExample3 {
    private static final String path = "ostream.dat";
    public static void main(String[] args) {
        try {
            writeObject();
            readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void writeObject() throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));) {
            out.writeInt(12345);
            out.writeUTF("文字列abc");
            out.writeObject(LocalDate.now());
        }
    }
    private static void readObject() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));) {
            int number = in.readInt();
            String str = in.readUTF();
            LocalDate date = (LocalDate)in.readObject();
            System.out.println(number + "\t" + str + "\t" + date);
        }
    }
}
