package inflearn.ch01;

import java.util.Scanner;

public class N0106 {
    private String solution(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            // Sol 1) 나의 풀이
            if(!result.contains(String.valueOf(str.charAt(i)))) result.concat(String.valueOf(str.charAt(i)));

            // Sol 2) indexOf 사용 : param type이 CharSequence 아닌 int 여서 형변환이 필요하지 않음
            if(i == str.indexOf(str.charAt(i))) result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        N0106 T = new N0106();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
