package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class N200_NumberOfIslands {
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public int numIslands(char[][] grid) {
        int result = 0;
        Queue<Node> queue = new LinkedList<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    queue.offer(new Node(i, j));
                    while (!queue.isEmpty()) {
                        Node node = queue.poll();
                        int X = node.x;
                        int Y = node.y;
                        for (int k = 0; k < 4; k++) {
                            int x = X + dx[k];
                            int y = Y + dy[k];
                            if (x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1) {
                                continue;
                            }
                            if (grid[x][y] == '1') {
                                grid[x][y] = '0';
                                queue.offer(new Node(x, y));
                            }
                        }
                    }
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        N200_NumberOfIslands T = new N200_NumberOfIslands();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(T.numIslands(grid));
    }
}
