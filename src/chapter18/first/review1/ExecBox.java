package chapter18.review1;

public class ExecBox {
    public static void main(String[] args) {
        Integer[] dt = {1, 2, 3, 4, 5};
        Box<Integer> box = new Box<>(dt);
        System.out.println(box.get(0));
    }
}
