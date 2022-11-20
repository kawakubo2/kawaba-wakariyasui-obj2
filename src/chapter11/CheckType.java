package chapter11;

public class CheckType {
    public static void main(String[] args) {
        Member mem = new Member(101, "山田太郎");
        if (mem instanceof Member) {
            System.out.println("Member型です");
        }
        if (mem instanceof Version) {
            System.out.println("Version型です");
        }
    }
}
