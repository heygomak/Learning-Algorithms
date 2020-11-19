package dynamic_programming;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day2_PocketmonTrainner {

	static int T; // test_case 개수
	static int N;
	static int Count, E;
	static int P[];
	static List<Integer> visited;
	static int ans;

	void rotate(int target) {
		if (visited.contains(target)) {
			Count++;
			if (ans < visited.size()) {
				ans = visited.size();
			}
			for (int i = 0; i < visited.size(); i++) {
				P[visited.get(i)] = -1;
			}
			visited = new ArrayList<>();
		} else {
			visited.add(visited.size(), target);
			int temp = P[target];
			rotate(temp);
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		T = Integer.parseInt(br.readLine().trim());
		Day2_PocketmonTrainner pt = new Day2_PocketmonTrainner();

		for (int test_case = 1; test_case < T + 1; test_case++) {
			N = Integer.parseInt(br.readLine().trim());
			st = new StringTokenizer(br.readLine().trim());
			P = new int[N];
			while (st.hasMoreTokens()) {
				for (int i = 0; i < N; i++) {
					P[i] = Integer.parseInt(st.nextToken());
				}
			}

			visited = new ArrayList<>();
			Count = 0;	ans = 0;
			
			for (int i = 0; i < N; i++) {
				if (P[i] > -1) {
					pt.rotate(i);
				}
			}
			
			bw.write("#" + test_case + " " + Count + " " + ans);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}
