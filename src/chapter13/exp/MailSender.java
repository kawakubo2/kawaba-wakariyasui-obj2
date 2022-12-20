package chapter13.exp;

import java.util.Random;

public class MailSender {
    public static void send() throws MailException {
        Random rand = new Random();
        if (rand.nextInt(100) >= 80) {
            throw new MailException("メールの送信に失敗しました。");
        }
        System.out.println("メールの送信に成功しました。");
    }
}
