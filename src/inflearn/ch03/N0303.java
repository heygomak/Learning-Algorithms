package inflearn.ch03;

import java.util.Scanner;

public class N0303 {
    private int solution(int n, int k, int[] a) {
        // Sliding Window 시간복잡도 목표치 : 단순 순회시 n * k → n
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += a[i];
        }
        int result = sum;

        for(int i = k; i < n; i++) {
            sum += a[i] - a[i - k];
            if(result < sum) result = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        N0303 T = new N0303();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, a));
    }
}
