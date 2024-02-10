package programmers;
public class N87946 {
    static int[][] dungeons;
    static int answer;
    static boolean[] visited;

    static void dfs(int k, int depth) {
        answer = Math.max(answer, depth);
        for (int i = 0; i < dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], depth + 1);
                visited[i] = false;
            }
        }
    }
    public int solution(int k, int[][] d) {
        dungeons = d;
        visited = new boolean[dungeons.length];
        dfs(k, 0);
        return answer;
    }

    public static void main(String[] args) {
        N87946 t = new N87946();
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(t.solution(k, dungeons));
    }
}
