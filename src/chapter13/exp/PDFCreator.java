package chapter13.exp;

import java.util.Random;

public class PDFCreator {
    public static void create() throws PDFException {
        Random rand = new Random();
        if (rand.nextInt(100) >= 80) {
            throw new PDFException("PDFファイルの作成に失敗しました");
        }
        System.out.println("PDFファイルの作詞に成功しました。");
    }
}
