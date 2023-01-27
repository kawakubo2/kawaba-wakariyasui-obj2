package chapter23.second;

public class SplitExample2 {
    public static void main(String[] args) {
        String dt = "100, 田中宏 , 60,5";
        String[] dts = dt.split("\\s*,\\s*");
        for (String s: dts) {
            System.out.println(s);
        } 
        
        String[] dates = { "2023/01/17", "2024-02-21", "2025.04.15" };
        for (String d: dates) {
            String[] sa = d.split("[/.-]");
            for (String s: sa) {
                System.out.print(Integer.parseInt(s) + " ");
            }
            System.out.println();
        } 
    }
}
