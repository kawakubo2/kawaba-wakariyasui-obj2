package chapter06;


public class Q6_2 {
    public static void main(String[] args) {
        Manager manager = new Manager(110, "森下樹", 32, "プロジェクトマネージャー");
        System.out.println(manager.getId() + "\t" + manager.getName() + "\t"
            + manager.getAge() + "\t" + manager.getTitle());
    }
}
