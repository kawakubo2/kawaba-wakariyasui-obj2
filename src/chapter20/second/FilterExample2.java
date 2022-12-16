package chapter20.second;

import java.util.List;

import chapter20.first.PC;

public class FilterExample2 {
    public static void main(String[] args) {
        var list = PC.getList();

        List<PC> makerPanan = list.stream()
            .filter(pc -> "Panan".equals(pc.maker()))
            .toList();
        
        System.out.println(makerPanan);
    }
}
