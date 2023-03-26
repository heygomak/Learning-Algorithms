package inflearn.ch02;

import java.util.Scanner;


public class N0211 {
    private int solution(int num, int[][] arr) {
        int result = 0, max = 0;

        for (int i = 0; i < num; i++) {
            int cnt = 0;
            for(int j = 0; j < num; j++) {
                for(int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (max < cnt) {
                max = cnt;
                result = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0211 T = new N0211();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num][5];
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
