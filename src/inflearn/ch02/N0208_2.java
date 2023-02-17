package inflearn.ch02;

import java.util.Scanner;

public class N0208_2 {
    private int[] solution(int num, int[] arr) {
        int[] result = new int[num];
        for(int i = 0; i < num; i++) {
            int rank = 1;
            for(int j = 0; j < num; j++) {
                if(arr[i] < arr[j]) rank ++;
            }
            result[i] = rank;
        }
        return result;
    }

    public static void main(String[] args) {
        N0208_2 T = new N0208_2();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(num, arr)) System.out.print(x + " ");
    }
}
