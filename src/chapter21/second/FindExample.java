package chapter21.second;

import java.util.List;
import java.util.Optional;

import chapter20.first.PC;

public class FindExample {
    public static void main(String[] args) {
        List<PC> pcList = PC.getList();

        Optional<String> anyPc = pcList.stream()
            // .filter(pc -> "Panan".equals(pc.maker()))
            .filter(pc -> "Panann".equals(pc.maker()))
            .map(PC::maker)
            .findAny();
        System.out.println(anyPc.orElseGet(() -> "存在しない"));
    }
}
