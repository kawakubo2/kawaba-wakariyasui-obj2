package chapter21.second;

import static java.util.stream.Collectors.*;

import java.util.List;

import chapter20.first.PC;
public class ToListExample {
    public static void main(String[] args) {
        var list = PC.getList();

        List<String> mutable = list.stream()
                        .map(PC::name)
                        .collect(toList());
        mutable.forEach(s -> System.out.print(s + " "));
        System.out.println();
        
        List<String> immutable = list.stream()
                        .map(PC::name)
                        .collect(toUnmodifiableList());
        immutable.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }    
}
