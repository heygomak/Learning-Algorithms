package programmers;

import java.util.ArrayList;

public class N12936 {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        long num = 1;
        int idx = 0;
        for(int x = 1 ; x <= n ; x++) {
            list.add(x);
            num *= x;
        }
        k--;  // 첫번째 줄을서고 시작함

        while(idx < answer.length) {
            num = num / n;
            int i = (int)(k / num);
            answer[idx] = list.get(i);
            list.remove(i);
            k %= num;
            idx++;
            n--;
        }

        return answer;
    }

    public static void main(String[] args) {
        N12936 t = new N12936();
        int n = 5;
        long k = 10;
        for(int i : t.solution(n, k)) System.out.print((Object) (i + " "));
    }
}
