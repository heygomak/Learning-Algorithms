package dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day6_TreasureHunt {
	static int N;		// 가로길이
	static int M;		// 세로길이
	static int[][] board;
	static int[] visited; //방문 체크
    static int T;
	static int ans;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		T = Integer.parseInt(br.readLine().trim());
		
		for (int test_case = 1; test_case < T + 1; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			board = new int[N][M];
			
			for(int n = 1; n <= N; n++) {
				st = new StringTokenizer(br.readLine());
				for(int m = 1; m < M; m++) {
					board[n][m] =  Integer.parseInt(st.nextToken());
				}
			}
			
			
			
			bw.write("#" + test_case + " " + ans);
			bw.write("\n");
			bw.flush();
			}
	}
}
