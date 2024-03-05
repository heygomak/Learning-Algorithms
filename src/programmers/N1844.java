package programmers;

import java.util.*;

public class N1844 {

    static int[][] map;
    static int[][] visited = new int[5][5];
    static Queue<Node> queue = new LinkedList<>();
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private boolean setPoint(int x, int y) {
        if(x == 4 && y == 4) return true;
        if(map[y][x] == 1 && visited[y][x] == 0) {
            visited[y][x] = 1;
            queue.offer(new Node(x, y));
        }
        return false;
    }

    public int solution(int[][] maps) {
        int answer = 1;
        map = maps;
        visited[0][0] = 1;
        queue.offer(new Node(0, 0));

        while (!queue.isEmpty()) {
            for(int i = 0; i < queue.size(); i++) {
                Node point = queue.poll();
                int x = point.x;
                int y = point.y;
                if(y > 0 && setPoint(x, y - 1)) return answer + 1;
                if(y < 4 && setPoint(x, y + 1)) return answer + 1;
                if(x > 0 && setPoint(x - 1, y)) return answer + 1;
                if(x < 4 && setPoint(x + 1, y)) return answer + 1;
            }
            answer ++;
        }

        return -1;
    }

    public static void main(String[] args) {
        N1844 t = new N1844();
        int k = 80;
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(t.solution(maps));
    }
}
