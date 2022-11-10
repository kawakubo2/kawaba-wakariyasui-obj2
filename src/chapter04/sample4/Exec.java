package chapter04.sample4;

public class Exec {
    public static void main(String[] args) {
        IdNumber id = new IdNumber(100);
        Member member = new Member(id, "田中宏");
        System.out.println(member);

        IdNumber _id = member.getId();
        _id.setNumber(200);
        System.out.println(member);
    }
}
