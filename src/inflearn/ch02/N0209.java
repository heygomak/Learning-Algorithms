package inflearn.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class N0209 {
    private int solution(int num, int[][] arr) {
        int result = 0;
        // 1. 행과 열의 합
        for (int i = 0; i < num; i++) {
            int tmp1 = 0, tmp2 = 0;
            // 행의 합 구할때 Arrays.stream(arr).sum() 하면 num=50 케이스에서 걸린다. 왜...?
            for (int j = 0; j < num; j++) {
                tmp1 += arr[i][j];
                tmp2 += arr[j][i];
            }
            result = Math.max(result, tmp1);
            result = Math.max(result, tmp2);
        }

        // 2. 대각선의 합
        int tmp1 = 0, tmp2 = 0;
        for (int i = 0; i < num; i++) {
            tmp1 += arr[i][i];
            tmp2 += arr[i][num -i - 1];
        }
        result = Math.max(result, tmp1);
        result = Math.max(result, tmp2);

        return result;
    }

    public static void main(String[] args) {
        N0209 T = new N0209();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
