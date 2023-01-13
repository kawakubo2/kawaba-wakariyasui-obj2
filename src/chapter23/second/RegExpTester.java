package chapter23.second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lib.Input;

public class RegExpTester {
    public static void main(String[] args) {
        while (true) {
            String pattern = Input.getString("正規表現(終了時はq)");
            if ("q".equals(pattern)) break;
            Pattern p = Pattern.compile(pattern);
            while (true) {
                String target = Input.getString("対象文字列(q)");
                Matcher m = p.matcher(target);
                if ("q".equals(target)) break;
                if (m.find()) {
                    System.out.println("○");
                } else {
                    System.out.println("×");
                }
            }
        }
    }
}
