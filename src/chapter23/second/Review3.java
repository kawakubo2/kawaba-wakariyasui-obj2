package chapter23.second;

public class Review3 {
    public static void main(String[] args) {
        System.out.println("--- A ---");
        String[] okA = {"a1", "A#?!", "a234567890"};
        String[] ngA = {"B", "1abc", "#kAbc", "A2345678901"};
        String patternA = "^[a-zA-Z].{1,9}$";
        RegExpUtil.test(patternA, okA, true);
        RegExpUtil.test(patternA, ngA, false);

        System.out.println("--- B ---");
        String[] okB = {"abc-12345", "xxx-34", "num-33", "xyz-9"};
        String[] ngB = {"abcd-123", "Abc-123", "ab-123", "ab2-123", "abc-a1",
                        "abc-123b", "xyz-"};
        String patternB = "^[a-z]{3}-\\d+$";
        RegExpUtil.test(patternB, okB, true);
        RegExpUtil.test(patternB, ngB, false);

        System.out.println("--- C ---");
        String[] okC = {"optimization", "transformation", "reduction", "fundamental"};
        String[] ngC = {"nl2br", "Ultra7", "iphone14", "3amigos", "109", "Java", "jkd for linux"};
        String patternC = "^[a-z]+$";
        RegExpUtil.test(patternC, okC, true);
        RegExpUtil.test(patternC, ngC, false);

        System.out.println("--- D ---");
        String[] okD = {"￥1,234", "￥12,345", "￥123,456"};
        String[] ngD = {"￥123", "￥1234", "￥1,234,567", "￥2345,678", "￥123,4567", 
                        "123,456$", "￥12a,345", "￥123,456.78", "￥123,456z"};
        String patternD = "^￥\\d{1,3},\\d{3}$";
        RegExpUtil.test(patternD, okD, true);
        RegExpUtil.test(patternD, ngD, false);

        System.out.println("--- E ---");
        String[] okE = {"1", "12", "12345", "+9", "+90", "+901234", "-3", "-34", "-3456"};
        String[] ngE = {"1.2", "++1", "--1", "1+", "2+", "12abc", "xyz456" };
        String patternE = "^[+-]?\\d+$";
        RegExpUtil.test(patternE, okE, true);
        RegExpUtil.test(patternE, ngE, false);

        System.out.println("--- F ---");
        String[] okF = {"1", "12", "12345", "+9", "+90", "+901234", "-3", 
                        "-34", "-3456", "1.2", "1.2345", "1234.5", "+1.2",
                        "+1.23", "+1.23456", "-2.3", "-2.34", "-2.234567"};
        String[] ngF = {"1.2.3", "123.345.6", "++1", "--1", "1+", "2+", 
                        "++1.23", "--1.23", "1.2-", "1.2+", "12abc", "xyz456",
                        ".123", "45.", "1..2" };
        String patternF = "^[+-]?\\d+(\\.\\d+)?$";
        RegExpUtil.test(patternF, okF, true);
        RegExpUtil.test(patternF, ngF, false);

        
    }
}
