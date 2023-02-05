package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class N5052 {
    private String solution(String[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1].startsWith(arr[i])) return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        N5052 T = new N5052();
        Scanner kb = new Scanner(System.in);
        int t = Integer.parseInt(kb.nextLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(kb.nextLine());
            String[] arr = new String[n];
            for (int j = 0; j < n; j++) {
                arr[j] = kb.nextLine();
            }
            System.out.println(T.solution(arr));
        }
    }
}
