package inflearn;

import java.util.Scanner;

public class N0101 {
    public int solution(String str, char t) {
        int answer = 0;
        t = Character.toUpperCase(t);
        str = str.toUpperCase();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t) answer ++;
        }
        return answer;
    }
    public static void main(String[] args) {
        N0101 T = new N0101();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char t = kb.next().charAt(0);
        System.out.println(T.solution(str, t));
    }
}
