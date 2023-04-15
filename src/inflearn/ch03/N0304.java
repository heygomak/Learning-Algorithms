package inflearn.ch03;

import java.util.Scanner;

public class N0304 {
    private int solution(int n, int m, int[] a) {
        int result = 0;
        // 나의 풀이 : 시간복잡도 N! 으로 마지막 테케에서 Time Limit Exceeded...
//        for (int i = 1; i <= n; i++) {
//            int sum = 0;
//            for(int j = 0; j < i; j++) {
//                sum += a[j];
//                if(sum == m) result ++;
//            }
//            for(int j = i; j < n; j++) {
//                sum += a[j] - a[j - i];
//                if(sum == m) result ++;
//            }
//        }

        // Two pointers 시간복잡도 목표치 : O(N²) → O(N)
        int sum = 0, lt = 0;
        for(int rt = 0; rt < n; rt++) {
            sum += a[rt];   // 초기에 전부다 더해주고
            if(sum == m) result ++;
            while (sum >= m) {    // sum이 m보다 작은 경우 제외시킴
                sum -= a[lt++];   // sum을 하나씩 감소시키면서 lt의 index를 1씩 증감
                if(sum == m) result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0304 T = new N0304();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, m, a));
    }
}
