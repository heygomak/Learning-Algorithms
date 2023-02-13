package inflearn.ch02;

import java.util.Scanner;

public class N0207 {
    private int solution(int[] arr) {
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                tmp ++;
            } else if (i > 0 && tmp > 0 && arr[i] == 0) {
                for (int j = 1; j <= tmp; j++) result += j;
                tmp = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0207 T = new N0207();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num + 1];
        for(int i = 0; i < num; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
