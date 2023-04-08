package inflearn.ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N0302 {
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);

        while (pointer1 < n && pointer2 < m) {
            if(a[pointer1] == b[pointer2]) {
                result.add(a[pointer1]);
                pointer1++;
                pointer2++;
            } else if (a[pointer1] < b[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0302 T = new N0302();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
