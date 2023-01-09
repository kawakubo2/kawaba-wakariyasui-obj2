package chapter18.sample2;

import java.util.ArrayList;
import java.util.Comparator;

class Parent {
    private double key = Math.random();
    public double key() {
        return key;
    }
}
class Child extends Parent {}

public class Sample2 {
    public static void main(String[] args) {
        var cList = new ArrayList<Child>();
        cList.add(new Child());
        cList.add(new Child());
        cList.add(new Child());
        cList.add(new Child());

        cList.sort(Comparator.comparing(Parent::key));
        for (Child c: cList) {
            System.out.println(c.key());
        }
    }
}
