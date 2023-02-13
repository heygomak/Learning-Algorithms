package inflearn.ch02;

import java.util.Scanner;

public class N0205 {
    private int solution(int n) {
        // Solution) 에라토스테네스 체 - 제곱근 방식보다 속도 빠름
        int answer = 0;
        int[] chk = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            if(chk[i] == 0) {
                answer ++;
                for(int j = i; j <= n; j = j + i) {
                    chk[j] = 1; // j의 배수들을 찾아서 변경
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N0205 T = new N0205();
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        System.out.println(T.solution(n));
    }
}
