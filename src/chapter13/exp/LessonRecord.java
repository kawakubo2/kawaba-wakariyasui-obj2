package chapter13.exp;

import java.util.Random;

public class LessonRecord {
    public static void getLessonRecord() throws LessonRecordException {
        Random rand = new Random();
        if (rand.nextInt(100) >= 80) {
            throw new LessonRecordException("受講記録の取得に失敗しました");
        }
        System.out.println("受講記録の取得に成功しました。");
    }
}
