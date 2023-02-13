package inflearn.ch01;

import java.util.Scanner;

public class N0103 {
    public String solution(String str) {
        String result = "";
        String[] arr = str.split(" ");
        for(String temp : arr) {
            if(temp.length() > result.length()) {
                result = temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        N0103 T = new N0103();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
