package chapter14;

import java.nio.file.Path;

public class PathExample2 {
    public static void main(String[] args) {
        Path p = Path.of("note.txt");
        System.out.println(p);
        System.out.println(p.toAbsolutePath());
        Path p2 = Path.of("");
        System.out.println(p2);
        System.out.println(p2.toAbsolutePath());
    }
    
}
