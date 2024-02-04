package programmers;

import java.util.ArrayList;

public class N42839 {
    static int N;
    static String[] arr;
    static boolean[] visited;
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isPrimeNumber(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private static void dfs(String num, int depth) {
        if(num.length() > 0) {
            int tmp = Integer.parseInt(num);
            if(!list.contains(tmp)) list.add(tmp);
        }
        if(depth == N) {
            return;
        } else {
            for (int i = 0; i < N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    dfs(num + arr[i], depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
    public static int solution(String numbers) {
        int answer = 0;
        N = numbers.length();
        visited = new boolean[N];
        arr = numbers.split("");
        dfs("", 0);
        for(int num : list) {
            if(isPrimeNumber(num)) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        N42839 t = new N42839();
        String numbers = "17";
        System.out.println(solution(numbers));
    }
}
