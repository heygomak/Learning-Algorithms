package inflearn.ch06;

import java.util.Scanner;
import java.util.Stack;

// 선택 정렬(Selection Sort) 구현
public class N0601 {
    private int[] solution(int n, int[] arr) {
        int tmp, idx;
        for(int i = 0; i < n - 1; i++) {     // n-1 까지만 돌려도 결과는 같다.
            idx = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        N0601 T = new N0601();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr)) System.out.print(i + " ");
    }
}
