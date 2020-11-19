package dynamic_programming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day2_PocketmonTrainner_2 {
  // 변수 선언부
	static int T; //test_case 개수
	static int N; //입력개수
	static int[] P; //실제 입력될 숫자
	static int Count, E; //진화과정 가지수, 가장긴 진화 주기
	static int[] visited; //방문 체크
	static int ans; //가장긴 진화주기
	
 // 메인 선언부 + input 정리 + 함수 호출
	public static void main(String[] args) throws Exception{
		long startTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		T = Integer.parseInt(br.readLine().trim());
		for(int test_case=1; test_case<T+1 ; test_case++) {
			N = Integer.parseInt(br.readLine().trim());
			st= new StringTokenizer(br.readLine().trim());
			
			Count=0;  ans=0;
			visited = new int[N];
			P = new int[N];
			
			for(int i=0; i<N; i++) {
				P[i]= Integer.parseInt(st.nextToken());
			}
			
			for(int i=0; i<N ; i++) visited[i]=0;
			//함수 호출 및 계산
			for(int i=0; i<N; i++) {
				E = 0;
				backtrack(i,i);
				if(ans < E ) ans = E;
			}
			bw.write("#"+test_case+" "+Count+" "+ans);
			bw.write("\n");
		}
		long endTime = System.currentTimeMillis();
		long lTime = endTime-startTime;
		System.out.println("실행시간="+lTime+"(ms)");
		
		bw.flush();
		bw.close();

		
	}
	
	//함수 선언부
	public static boolean backtrack(int start, int n) {
		//System.out.println("P[n]="+P[n]);
		if(visited[n]==0) {
			visited[n] = 1;
			E = E+1;
			if(start==P[n]) {
				Count=Count+1;
				return false;
			}else {
				backtrack(start,P[n]);
			    return true;
			}
		}else {
			return false;
		}
	}
 
}