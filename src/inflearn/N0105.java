package inflearn;

import java.util.Scanner;

public class N0105 {
    private String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        char temp;
        while (lt < rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else {
                temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++; rt--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        N0105 T = new N0105();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.next()));
    }
}
