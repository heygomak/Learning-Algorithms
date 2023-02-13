package inflearn.ch01;

import java.util.Scanner;

public class N0104 {
    private String solution(String str) {
        String result = "";
        char[] s =  str.toCharArray();
        // Sol 1) 나의 풀이
        for(Character c : s) result = c + result;

        // String을 가공하면 기존 문자열이 바뀌는 것이 아닌 새로운 메모리가 추가되는 것인데,
        // StringBuilder 미리 일정 메모리를 확보해서 가변적으로 문자열 처리가 가능하므로 문자열 연산이 많을때 효율적임.
        // append, insert, delete, replace, indexOf, reverse...

        // * StringBuilder   vs. StringBuffer
        //----------------------------------------
        //  non-synchronized    synchronized
        //  more efficient       less efficient, thead safe

        // Sol 2) StringBuilder 사용
        result = new StringBuilder(str).reverse().toString();

        // Sol 3) 직접 뒤집기
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt ++; rt--;
        }
        result = String.valueOf(s);

        return result;
    }

    public static void main(String[] args) {
        N0104 T = new N0104();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        for(int i = 0; i < n; i++) {
            System.out.println(T.solution(kb.nextLine()));
        }
    }
}
