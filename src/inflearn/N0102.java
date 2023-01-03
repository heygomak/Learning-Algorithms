package inflearn;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class N0102 {
    public String solution(String str) {
        String answer = "";
        for(char chr : str.toCharArray()) {
            answer += isUpperCase(chr) ? Character.toLowerCase(chr) : Character.toUpperCase(chr);
        }
        return answer;
    }
    public static void main(String[] args) {
        N0102 T = new N0102();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
