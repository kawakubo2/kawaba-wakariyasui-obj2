package chapter23.second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegExpUtil {
    // 行頭行末マッチのみのテスト
    public static void test(String pattern, String[] targets, boolean normal) 
        throws PatternSyntaxException {
        System.out.println("------< " + (normal ? "OK": "NG") + "パターン");
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        int count = 0;
        for (String target: targets) {
            System.out.print(target + ": ");
            m = p.matcher(target);
            if (m.find()) {
                count++;
                System.out.println("○");
            } else {
                System.out.println("×");
            }
        }
        String judge;
        if (normal) {
            judge = (count == targets.length) ? "合格": "不合格";
        } else {
            judge = (count == 0) ? "合格": "不合格";
        }
        System.out.printf("判定: %d/%d %s%n", count, targets.length, judge);
        System.out.println();
    }
}
