package programmers;

import java.util.*;

public class N42842 {
    static int[] answer = new int[2];
    static int width;
    static List<int[]> yellowList = new ArrayList<int[]>();

    private static void getYellowMatrix(int yellow) {
        int tmpX = yellow, tmpY = 1;
        yellowList.add(new int[]{tmpX, tmpY});
        while (tmpX >= tmpY) {
            if(yellow % tmpY++ != 0) continue;
            tmpX = yellow / tmpY;
            yellowList.add(new int[]{tmpX, tmpY});
        }
    }

    public static boolean isYellowCenter(int x, int y) {
        if (x * y != width) return false;
        for(int[] w : yellowList) {
           if(x > w[0] && ((x - w[0]) % 2 == 0) && y > w[1] && ((y - w[1]) % 2 == 0)) {
               return true;
           }
        }
        return false;
    }


    private static void dfs(int x, int y) {
        if(x >= y && !isYellowCenter(x, y)) {
            dfs(width / (y + 1), y + 1);
        } else {
            answer[0] = x;
            answer[1] = y;
            return;
        }
    }

    public static int[] solution(int brown, int yellow) {
        width = brown  + yellow;
        getYellowMatrix(yellow);
        dfs(width, 1);
        return answer;
    }

    public static void main(String[] args) {
        N42842 t = new N42842();
        int brown = 4800000;
        int yellow = 1200000;

        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(Arrays.toString(solution(brown, yellow)));
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
    }
}
