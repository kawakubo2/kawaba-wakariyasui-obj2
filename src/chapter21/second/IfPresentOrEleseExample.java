package chapter21.second;

import java.util.Optional;

import chapter20.first.PC;

public class IfPresentOrEleseExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Optional<PC> anyPc =
            list.stream()
                .filter(pc -> "Panann".equals(pc.maker()))
                .findAny();

        anyPc.ifPresentOrElse(
            pc -> System.out.println(pc.name()), 
            () -> System.out.println("該当がありません")
        );
    }
}
