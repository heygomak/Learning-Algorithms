package inflearn.ch02;

import java.util.Scanner;

public class N0204 {
    private int[] solution(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        for(int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i -2];
        }
        return result;
    }

    public static void main(String[] args) {
            N0204 T = new N0204();
            Scanner kb = new Scanner(System.in);
            int n = Integer.parseInt(kb.nextLine());
            for(int x : T.solution(n)) System.out.print(x + " ");
    }
}
