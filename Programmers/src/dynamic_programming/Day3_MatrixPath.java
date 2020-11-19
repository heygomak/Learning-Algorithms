package dynamic_programming;

public class Day3_MatrixPath {
	
	static int N; // 행렬의 크기
	
	/*
	 * 행렬경로문제 
	 * 	- 행렬에서 오른쪽 또는 밑으로만 이동할 수 있다. 
	 * 	- L[i, j] = (1,1)에서 (i,j)까지 이르는 최소합
	 *  	- Mij = (i, j)의 정수값
	 * 	- 경로구하기의 경우, 추가로 int[2][(N-1)*2 ]의 배열을 선언해서 담는다.
	 * 	- base case + general case 순환식 세우기
	 */

	/* 1. 단순분할정복 */
	int mat(int i, int j) {
		int[][] m = new int[N][N];
		if (i == 1 && j == 1) {
			return m[i][j];
		} else if (i == 1) {
			return mat(1, j - 1) + m[i][j];
		} else if (j == 1) {
			return mat(i - 1, 1) + m[i][j];
		} else
			return Math.min(mat(i - 1, j), mat(i, j - 1)) + m[i][j];
	}

	/* 2. memoization */
	int memoization(int i, int j) {
		int[][] m = new int[N][N];
		int[][] L = new int[N][N];
		if (i == 1 && j == 1) {
			L[i][j] = m[i][j];
		} else if (i == 1) {
			L[i][j] = memoization(1, j - 1) + m[i][j];
		} else if (j == 1) {
			L[i][j] = memoization(i - 1, 1) + m[i][j];
		} else
			L[i][j] = Math.min(memoization(i - 1, j), memoization(i, j - 1)) + m[i][j];
		return L[i][j];
	}

	/*
	 * 3. Bottom-Up 
	 * 	- 단, 행순서로 계산할 때만 성립함
	 */
	int bottomUp() {
		int[][] m = new int[N][N];
		int[][] L = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 1 && j == 1) {
					L[i][j] = m[i][j];
				} else if (i == 1) {
					L[i][j] = L[i][j - 1] + m[i][j];
				} else if (j == 1) {
					L[i][j] = L[i - 1][j] + m[i][j];
				} else
					L[i][j] = Math.min(L[i - 1][j], L[i][j - 1]) + m[i][j];
			}
		}
		return L[N][N];
	}
	
	/* 4. Common Trick
	 * 	: 0번째 행, 0번째 열에 무한대의 값을 채워넣음으로써 조건문을 합칠 수 있다.
	 *       최소값을 선택하기 때문에 0번째 행,열인 경우 무한대가 선택될 가능성이 없으므로.
	 * */
	int recursion() {
		int[][] m = new int[N][N];
		int[][] L = new int[N][N];
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 1 && j == 1) {
					L[i][j] = m[i][j];
				}  else
					L[i][j] = Math.min(L[i - 1][j], L[i][j - 1]) + m[i][j];	
			}
		}
		return L[N][N];
	}

	public static void main(String[] args) {

	}
}
