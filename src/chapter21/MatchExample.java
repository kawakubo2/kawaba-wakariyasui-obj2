package chapter21;

import java.util.List;

import chapter20.first.PC;

public class MatchExample {
    public static void main(String[] args) {
        List<PC> pcList = PC.getList();
        System.out.println("---< anyMatch >---");
        if (pcList.stream().anyMatch(pc -> "ARIBAN".equals(pc.name()))) {
            System.out.println("ARIBANという名前のパソコンはあります。");
        } else {
            System.out.println("ARIBANという名前のパソコンはありません。");
        }

        System.out.println("---< allMatch >---");
        if (pcList.stream().allMatch(pc -> "ARIBAN".equals(pc.name()))) {
            System.out.println("すべてのパソコンはARIBANという名前です。");
        } else {
            System.out.println("すべてのパソコンがARIBANという名前というわけではありません。");
        }

        System.out.println("---< noneMatch >---");
        if (pcList.stream().noneMatch(pc -> "ARIBAN".equals(pc.name()))) {
            System.out.println("すべてのパソコンはARIBANという名前ではありません。");
        } else {
            System.out.println("少なくとも1つはARIBANという名前です。");
        }
    }
}
