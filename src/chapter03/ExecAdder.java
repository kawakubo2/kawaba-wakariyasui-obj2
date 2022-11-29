package chapter03;

public class ExecAdder {
    public static void main(String[] args) {
        Adder adder1 = new Adder(100);
        Adder adder2= new Adder(1000);
        adder1.add();
        adder2.add();
        adder1.add();
        adder2.add();
        System.out.println("adder1のnumber=" + adder1.getNumber());
        System.out.println("adder2のnumber=" + adder2.getNumber());
    }
}
