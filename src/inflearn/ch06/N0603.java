package inflearn.ch06;

import java.util.Scanner;

// 삽입 정렬(Burble Sort) 구현
public class N0603 {
    private int[] solution(int n, int[] arr) {
        int tmp;
        for(int i = 1; i < n; i++) {    // 이전값들과 비교하므로 2번째 원소부터 시작
            tmp = arr[i];
           int j = i - 1;

            for(j = i - 1; j >= 0; j--){
                if(arr[j] > tmp){
                    arr[j + 1] = arr[j];
                } else {
                    break;   // 이미 모두 정렬이 되어있을 경우 최적의 시간복잡도 = n
                }
            }

            arr[j + 1] = tmp;   // 앞의 원소가 타겟 원소보다 작을때를 만나는 지점의 j + 1 에 한번만 삽입

        }
        return arr;
    }

    public static void main(String[] args) {
        N0603 T = new N0603();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr)) System.out.print(i + " ");
    }
}
