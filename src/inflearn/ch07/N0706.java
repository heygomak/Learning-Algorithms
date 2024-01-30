package inflearn.ch07;

import java.util.Scanner;

// 이진트리순회(DFS : Depth-First Search)
public class N0706 {
    static int n;
    static int[] visited;
    StringBuffer sb = null;
    private void DFS(int num) {
        if(num == n + 1) {
            sb = new StringBuffer();
            for(int i = 1; i < visited.length; i++) {
                if(visited[i] == 1) sb.append(i).append(" ");
            }
            System.out.println(sb);
        } else {
            visited[num] = 1;
            DFS(num + 1);
            visited[num] = 0;
            DFS(num + 1);
        }
    }

    public static void main(String[] args) {
        N0706 T = new N0706();
        Scanner kb = new Scanner(System.in);
        n = 3;
        visited = new int[n + 1];
        T.DFS(1);
    }
}
