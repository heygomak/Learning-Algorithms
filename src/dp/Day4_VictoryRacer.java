package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day4_VictoryRacer {
	static int T; 				// test case 갯수
	static int N; 			// 입력 갯수
	static int F;				// 첫번째 타이어의 수명
	static int[] L;  			// 교체지점
	static int[] cost; 	// 타이어 수명
	static int[] dp;		// dp 수행
	static final int INF = 100;
	static int ans;			// 답
	
	public static void main(String[] args) throws Exception  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		T = Integer.parseInt(br.readLine().trim());
		
		for (int test_case = 1; test_case < T + 1; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			F = Integer.parseInt(st.nextToken());
			L = new int[N + 1];
			cost = new int[N + 2];
			
			for(int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				L[i] =  Integer.parseInt(st.nextToken());
				cost[i] =  Integer.parseInt(st.nextToken());
			}
			
			L[0] = F;								// 첫번째 타이어의 수명 설정
			cost[N + 1] = 0; 					// 마지막 도착점은 소요시간 0으로 설정
			dp = new int[N + 2];		// dp[N] : N지점에서 정비할때 최소 소요시간
			
			repeat();
			int ans = dp[N + 1];
			
			bw.write("#" + test_case + " " + ans);
			bw.write("\n");
			bw.flush();
		}
	}
	
	static void repeat() {
		Arrays.fill(dp,  INF);
		dp[0] = 0;
		for(int i = 1; i <= N + 1; i++) {		// 지점
			for(int j = 0; j < i; j++) {				// 타이어 수명에 대한 체킹
				if((L[j] + j - i) < 0) {
					continue;
				}
				dp[i] = Math.min(dp[i],  dp[j] + cost[i]);
			}
		}
	}
}
