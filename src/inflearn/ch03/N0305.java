package inflearn.ch03;

import java.util.Scanner;

public class N0305 {
    private int solution(int n) {
        // Two pointers 시간복잡도 목표치 : O(N²) → O(N)
        int result = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;  // 필요한 연속된 자연수

        for(int rt = 1; rt < m; rt++) {
            sum += rt;
            if(sum == n) result ++;
            while (sum >= n) {    // sum이 m보다 작은 경우 제외시킴
                sum -= lt++;      // sum을 하나씩 감소시키면서 lt의 index를 1씩 증감
                if(sum == n) result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0305 T = new N0305();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
