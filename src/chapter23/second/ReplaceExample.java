package chapter23.second;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceExample {
    public static void main(String[] args) {
        // 名前,年齢,身長,体重,出身都道府県 ---> 出身都道府県,名前,年齢
        String[] members = {
            "Taro Yamada,28,172,68,Tokyo",
            "Hanako Yokoyama,35,158,50,Osaka",
            "Ichir Tanaka,55,180,87,Fukuoka",
        };
        String pattern = "^([a-zA-Z]+ [a-zA-Z]+),(\\d{1,3}),(\\d{2,3}),(\\d{1,3}),([a-zA-Z]+)$";
        Pattern p = Pattern.compile(pattern);
        Matcher m;
        for (String mem: members) {
            m = p.matcher(mem);
            while(m.find()) {
                System.out.println(m.group(5) + "," + m.group(1) + "," + m.group(2));
            }
        }
    }
}
