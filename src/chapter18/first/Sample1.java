package chapter18.first;

import java.util.ArrayList;
import java.util.List;

class Parent {}
class Child extends Parent {}

public class Sample1 {
    public static void main(String[] args) {
        var cList = new ArrayList<Child>();
        cList.add(new Child());        
        cList.add(new Child());        

        List<Parent> pList = List.copyOf(cList);
        System.out.println(pList);
    }
}
