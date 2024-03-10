package programmers;

import java.util.*;

public class N1844 {
    int[] dx = {0, 1, -1, 0};
    int[] dy = {1, 0, 0, -1};
    static int[][] visited;
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private int bfs(int[][] maps) {
        int answer = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));

        while (!queue.isEmpty()) {
            for(int i = 0; i < queue.size(); i++) {
                Node point = queue.poll();
                int X = point.x;
                int Y = point.y;
                for(int j = 0; j < 4; j ++) {
                    int x = X + dx[j];
                    int y = Y + dy[j];
                    if(x == maps.length - 1 && y == maps[0].length - 1) {
                        return answer + 1;
                    }
                    if (x < 0 || x > maps.length - 1 || y < 0 || y > maps[0].length - 1) {
                        continue;
                    }
                    if(maps[x][y] == 1 && visited[x][y] != 1) {
                        visited[x][y] = 1;
                        queue.offer(new Node(x, y));
                    }
                }
            }
            answer ++;
        }
        return -1;
    }

    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1;

        return bfs(maps);
    }

    public static void main(String[] args) {
        N1844 t = new N1844();
        int k = 80;
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(t.solution(maps));
    }
}
