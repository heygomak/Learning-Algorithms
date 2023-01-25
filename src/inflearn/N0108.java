package inflearn;

import java.util.Scanner;

public class N0108 {
    private String solution(String str) {
        // Sol 1) 나의 풀이 : 직접 치환
        char[] arr = str.toUpperCase().toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(!Character.isAlphabetic(arr[i])) {
                str = str.replace(String.valueOf(arr[i]), "");
            }
        }
        // Sol 2) replaceAll, 정규표현식 사용
        //str = str.toUpperCase().replaceAll("[^A-Z]", "");

        return str.equals(new StringBuilder(str).reverse().toString()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        N0108 T = new N0108();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
