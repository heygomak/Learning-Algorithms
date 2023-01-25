package inflearn;

import java.util.Scanner;

public class N0109 {
    private int solution(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public static void main(String[] args) {
        N0109 T = new N0109();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
