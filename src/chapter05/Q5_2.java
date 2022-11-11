package chapter05;

public class Q5_2 {
    public static void main(String[] args) {
        Product product = new Product("MT890", "ステンレスネジ", 280, false);
        System.out.println("商品コード = " + product.code());
        System.out.println("商品名　　 = " + product.name());
        System.out.println("価格　　　 = " + product.price());
        System.out.println("欠品　　　 = " + product.shortage());
    }
}
