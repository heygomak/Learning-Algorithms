package inflearn.ch02;

import java.util.Scanner;

public class N0210 {
    private int solution(int num, int[][] arr) {
        int result = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
//                if(arr[i][j] > arr[i - 1][j] && arr[i][j] >  arr[i][j - 1] &&
//                        arr[i][j] >  arr[i + 1][j] && arr[i][j] >  arr[i][j + 1]) {
//                    result ++;
//                }
                boolean flag = true;
                for(int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = i + dy[k];
                    // 조건 중 하나라도 불일치할때 즉시 break 시키면 시간복잡도 줄일수있다.
                    if(arr[i][j] <= arr[i - 1][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0210 T = new N0210();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] arr = new int[num + 2][num + 2];
        for (int i = 0; i < num + 2; i++) {
            for (int j = 0; j < num + 2; j++) {
                // 격자판 가장자리 초기화
                if(i == 0 || i == num + 1 || j == 0 || j == num + 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = kb.nextInt();
                }
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
