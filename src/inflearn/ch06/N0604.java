package inflearn.ch06;

import java.util.*;

public class N0604 {
    private int[] solution(int s, int[] arr) {
        int[] cache = new int[s];
        for(int i = 0; i < s; i++) cache[i] = 0;
        for(int job : arr) {
            for(int i = 0; i < s; i++){
                if(cache[i] == job || cache[i] == 0 || i == s - 1) {
                    for(int j = i; j > 0; j--){
                        cache[j] = cache[j - 1];
                    }
                    cache[0] = job;
                    break;
                }
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        N0604 T = new N0604();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for(int i : T.solution(s, arr)) System.out.print(i + " ");
    }
}
