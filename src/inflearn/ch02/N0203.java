package inflearn.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class N0203 {
    private String solution(int a, int b) {
        if(a == b) return "D";
        return (a - b == 1 || a - b == -2) ? "A" : "B";
    }

    public static void main(String[] args) {
        N0203 T = new N0203();
        Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.nextLine());
        int[] A = Arrays.stream(kb.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(kb.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < num; i++) {
            System.out.println(T.solution(A[i], B[i]));
        }
    }
}
