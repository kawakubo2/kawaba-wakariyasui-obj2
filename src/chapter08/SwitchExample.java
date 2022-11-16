package chapter08;

public class SwitchExample {
    public static void main(String[] args) {
        // Object obj = new B();
        // String result = switch(obj) {
        //     case C c -> c.name();
        //     case B b -> b.name();
        //     case A a -> obj).name();
        //     case null -> "nullです";
        //     default   -> "その他のクラスです";
        // };
    }
}

class A {
    public String name() {
        return "Aクラス";
    }
}
class B extends A {
    public String name() {
        return "Bクラス";
    }
}
class C extends B {
    public String name() {
        return "Cクラス";
    }
}
