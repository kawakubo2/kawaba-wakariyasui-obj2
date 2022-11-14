package chapter07.p11;

import chapter07.p10.Obj10;

public class Sub11 extends Obj10 {
    private String s;
    public Sub11(String s) {
        this.s = s;
    }
    public void print(Sub11 sub) {
        System.out.println(sub.getNumber());
    }
    public void printStr(Sub11 sub) {
        System.out.println(sub.s);
    } 
}
