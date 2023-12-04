package inflearn.ch05;

import java.util.*;

public class N0506 {
    private int solution(int n, int k) {
        int num = k;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) queue.add(i);
        while (!queue.isEmpty()) {
            for(int i = 0; i < k - 1; i++) queue.add(queue.poll());
            num = queue.poll();
        }
        return num;
    }

    public static void main(String[] args) {
        N0506 T = new N0506();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextInt(), kb.nextInt()));
    }
}
