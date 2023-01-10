package chapter23.second;

import lib.Input;

public class Codepoint {
    public static void main(String[] args) {
        String name = Input.getString("名前: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + " の文字コードは " + name.codePointAt(i));
        }
    }
}
