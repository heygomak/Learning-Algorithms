package baekjoon;

import java.util.Scanner;

public class N11659 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num + 1];
        int cnt = kb.nextInt();
        for(int i = 1; i < num + 1; i++) {
            // 배열에 누적합을 입력해 시간복잡도를 줄인다.
            arr[i] = kb.nextInt() + arr[i - 1];
        }
        for(int i = 0; i < cnt; i++) {
            int num1 = kb.nextInt() - 1;
            int num2 = kb.nextInt();
            System.out.println(arr[num2] - arr[num1]);
        }
    }
}
