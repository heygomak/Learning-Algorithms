package inflearn.ch07;

import java.util.LinkedList;
import java.util.Queue;

// 이진트리레벨탐색(BFS : Breadth-First Search)
public class N0708 {
    static int[] visited = new int[10001];
    static int[] dist = {1, -1, 5};
    static int answer = 0;
    static Queue<Integer> queue = new LinkedList<>();

    private int BFS(int s, int e) {
        // 큐 초기화 작업
        visited[s] = 1;
        queue.offer(s);
        int L = 0;  // 레벨

        while (!queue.isEmpty()) {
            int len = queue.size(); // 큐의 길이(해당 레벨에 있는 원소의 갯수)
            for(int i = 0; i < len; i++) {
                int x = queue.poll();
                for(int j : dist) {
                    int nx = x + j;
                    if(nx == e) return L + 1;
                    if(visited[nx] != 1 && nx > 0 && nx < 10001) {  // 이미 방문한 곳은 제외시킨다.
                        visited[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        N0708 T = new N0708();
        System.out.println(T.BFS(5, 14));
    }
}
