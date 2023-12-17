package inflearn.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class N0605 {
    private String solution(int n, int[] arr) {
        int tmp;
        /**
         * hashmap 처리시 시간복잡도 O(n)
         *  array 처리시 O(nlogn)
         * */

//        Arrays.sort(arr);
//        for(int i = 0; i < n - 1; i++){
//            if(arr[i] == arr[i + 1]) return "D";
//        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]) return "D";
            }
        }

        return "U";
    }

    public static void main(String[] args) {
        N0605 T = new N0605();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
