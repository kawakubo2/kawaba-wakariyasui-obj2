package chapter00;

public class MobilePhoneConverter {
    public String setHyphen(String orginal) {
        StringBuffer sb = new StringBuffer(orginal);
        if (sb.charAt(3) != '-') {
            sb.insert(3, '-');
        }
        if (sb.charAt(8) != '-') {
            sb.insert(8, '-');
        }
        return sb.toString();
    }
}