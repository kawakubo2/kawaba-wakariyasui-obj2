package chapter00;

public class MobilePhoneConverterTest {
    public static void main(String[] args) {
        MobilePhoneConverter converter = new MobilePhoneConverter();

        String[] tels = { "09012345678", "080-12345678", "0701234-5678", "060-1234-5678" };
        for (String tel : tels) {
            String result = converter.setHyphen(tel);
            System.out.printf("%s : %s%n", tel, result);
        }
    }
}
