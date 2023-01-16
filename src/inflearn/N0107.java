package inflearn;

import java.util.Scanner;

public class N0107 {
    private String solution(String str) {
        // Sol 1) 나의 풀이 : 직접 비교
        char[] arr = str.toUpperCase().toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if(arr[lt] != arr[rt]) return "NO";
            lt ++; rt--;
        }
        return "YES";

        // Sol 2) StringBuilder, equalsIgnoreCase 사용
//        if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) return "YES";
//        else return "NO";
    }

    public static void main(String[] args) {
        N0107 T = new N0107();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
