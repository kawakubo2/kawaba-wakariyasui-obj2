package chapter21.second;

import java.util.List;

import chapter20.first.PC;

public class MatchExample {
    public static void main(String[] args) {
        List<PC> pcList = PC.getList();

        if (pcList.stream().anyMatch(pc -> "ARIBAN".equals(pc.name()))) {
            System.out.println("ARIBANという名前のパソコンはあります。");
        } else {
            System.out.println("ARIBANという名前のパソコンはありません。");
        }
    }
}
