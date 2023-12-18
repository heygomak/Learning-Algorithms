package inflearn.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class N0606 {
    private String solution(int n, int[] arr) {
        int c = 0, f = 0;

        int[] tmp = arr.clone(); // 원본의 메모리를 참조하지 않는 깊은복사
        Arrays.sort(tmp);

        for(int i = 0; i < n; i++){
            if (arr[i] != tmp[i]) {
                c = i + 1;
                break;
            }
        }
        for(int i = c ; i < n; i++){
            if (arr[i] != tmp[i]) {
                f = i + 1;
                break;
            }
        }

        return String.valueOf(c) + " " + String.valueOf(f);
    }

    public static void main(String[] args) {
        N0606 T = new N0606();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
