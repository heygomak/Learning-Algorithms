package inflearn.ch06;

import java.util.Scanner;

// 버블 정렬(Burble Sort) 구현
public class N0602 {
    private int[] solution(int n, int[] arr) {
        int tmp;
        for(int i = 0; i < n - 1; i++) {    // n-1번 회전(ex. 원소 5개라면 4회 회전)
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        N0602 T = new N0602();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr)) System.out.print(i + " ");
    }
}
