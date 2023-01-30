package inflearn;

import java.util.Arrays;
import java.util.Scanner;

public class N0202 {
    private int solution(int num, int[] arr) {
        int result = 0;
        int max = 0;
        for(int i = 0; i < num - 1; i++) {
            if(max < arr[i]) {
                max = arr[i];
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0202 T = new N0202();
        Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.nextLine());
        int[] arr = Arrays.stream(kb.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(T.solution(num, arr));
    }
}
