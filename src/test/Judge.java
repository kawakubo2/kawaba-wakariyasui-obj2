package test;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Judge {
    public static void main(String[] args) {
        Map<String, Integer> bits = Map.of(
            "00", Integer.valueOf(0b100000000), 
            "01", Integer.valueOf(0b010000000),
            "02", Integer.valueOf(0b001000000),
            "10", Integer.valueOf(0b000100000),
            "11", Integer.valueOf(0b000010000),
            "12", Integer.valueOf(0b000001000),
            "20", Integer.valueOf(0b000000100),
            "21", Integer.valueOf(0b000000010),
            "22", Integer.valueOf(0b000000001)
            );
        Set<String> set = new HashSet<>();
        int win[] = {
            0b111000000, 0b000111000, 0b000000111, 0b100100100, 0b010010010,
            0b001001001, 0b100010001, 0b001010100
        };
        Scanner in = new Scanner(System.in);
        int player1 = 0b000000000;
        int cnt = 0;
        while (cnt < 5) {
            System.out.println("あなたの番");
            String s = in.nextLine();
            if (set.contains(s)) {
                System.out.println("そこは打てません"); 
                continue;
            }
            set.add(s);
            int m = bits.get(s);
            player1 |= m;
            cnt++;
        }
        in.close();
        System.out.println(Integer.toBinaryString(player1));
        boolean loose = true;
        for (int w : win) {
            if ((w & player1) == w) {
                System.out.println("勝ち");
                loose = false;
                break;
            }
        }
        if (loose) {
            System.out.println("負け");
        }
    }
}
