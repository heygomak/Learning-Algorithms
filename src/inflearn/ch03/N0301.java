package inflearn.ch03;

import java.util.Scanner;

public class N0301 {
    private int[] solution(int n, int m, int[] a, int[] b) {
        int pointer1 = 0, pointer2 = 0; // two pointer
        int totalCnt = n + m;  // 시간복잡도 목표치 O(N), 정렬시 O(N * logN) 으로 늘어남
        int nowCnt = 0;
        int[] result = new int[totalCnt];

        while (pointer1 < n && pointer2 < m) {
            if (a[pointer1] < b[pointer2]) {
                result[nowCnt] = a[pointer1];
                pointer1++;
            } else {
                result[nowCnt] = b[pointer2];
                pointer2++;
            }
            nowCnt ++;
        }
        while (pointer1 < n) {
            result[nowCnt] = a[pointer1];
            pointer1++;
            nowCnt++;
        }
        while (pointer2 < m) {
            result[nowCnt] = b[pointer2];
            pointer2++;
            nowCnt++;
        }
        return result;
    }

    public static void main(String[] args) {
        N0301 T = new N0301();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
