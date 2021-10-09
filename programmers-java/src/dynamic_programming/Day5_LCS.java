package dynamic_programming;

public class Day5_LCS {
	static String[] x = { "B",  "D",  "C",  "A",  "B",  "A" };
	static String[] y = { "A",  "B",  "C",  "B",  "D",  "A",  "B" };
	static int[][] c = new int[x.length + 1][y.length + 1];

	public static void main(String[] args) {
		/*
		 * Longest Common Subsequence 
		 * 			<bcdb> => <abcbdab> 의 subsequence (부분) 
		 * 			<bca> => <abcbdab>,  <bdcaba> 의 common subsequence (공통부분)
		 * 
		 * L[i,  j] 의 점화식
		 * 		- 0 (i = 0 or j = 0) 
		 * 		- L[i - 1,  j - 1] + 1 (Xi = Yj)
		 * 		- max(L[i - 1,  j],  L[i,  j -1]) (otherwise)
		 */
		
		Day5_LCS lcs = new Day5_LCS();
		System.out.println(lcs.lcs(x.length,  y.length));
		
		/* 
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int[][] lcsDp = new int[str1.length() + 1][str2.length() + 1];
		int lcsLength = 0;
		String lcsString = "";
		str1 = '0' + str1;
		str2 = '0' + str2;
		

		for(int i = 1; i < str1.length(); i++) {
			for(int j = 1; j < str2.length(); j++) {
				if(str2.charAt(j) == str1.charAt(i)) {
					lcsDp[i][j] = lcsDp[i - 1][j - 1] + 1;
				} else {
					lcsDp[i][j] = Math.max(lcsDp[i][j - 1] ,  lcsDp[i - 1][j]);
				}
			}
		}
		
		int cnt = lcsLength;
		for(int i = str1.length() - 1; i >0;) {
			for(int j = str2.length() - 1; j >0;) {
				if(lcsDp[i][j] == lcsDp[i][j - 1]) {
					j--;
				} else if(lcsDp[i][j] == lcsDp[i - 1][j]) {
					i--;
				} else {
					lcsString += str1.charAt(i);
					i--; j--;
				}
 			}
		}
	
		System.out.println("LCS length : " + lcsLength);
		System.out.println("LCS String : " + lcsString);
		*/
	}

	int lcs(int m,  int n) {
		for (int i = 0; i <= m; i++) {
			c[i][0] = 0; // row
		}
		for (int j = 0; j <= n; j++) {
			c[0][j] = 0; // col
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (x[i] == y[j]) {
					c[i][j] = c[i - 1][j - 1] + 1;
				} else {
					c[i][j] = Math.max(c[i - 1][j],  c[i][j - 1]);
				}
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		return c[m][n];
	}
	/*
	 * 000111
	 * 011111 
	 * 011122 
	 * 112223 
	 * 112233
	 */
}
