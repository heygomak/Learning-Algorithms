package inflearn;

import java.util.Scanner;

public class N0112 {
    private String solution(int num, String str) {
        String result = "";
        for(int i = 0; i < num; i++) {
            String a = str.substring(i * 7, (i + 1) * 7);
            String b = a.replace("#", "1").replace("*", "0");
            int c = Integer.parseInt(b, 2); // 2진수 -> 10진수 변환
            char d = (char) c;  // 10진수 -> ascii 변환
            result += d;
        }
        return result;
    }

    public static void main(String[] args) {
        N0112 T = new N0112();
        Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.nextLine());
        String str = kb.nextLine();
        System.out.println(T.solution(num, str));
    }
}
