package inflearn.ch01;

import java.util.Scanner;

public class N0111 {
    private String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char ch = ' ';
        int cnt = 1;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                cnt++;
            } else {
                if(cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
                ch = str.charAt(i);
                sb.append(ch);
            }
        }
        if(cnt > 1) sb.append(cnt);
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        N0111 T = new N0111();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
