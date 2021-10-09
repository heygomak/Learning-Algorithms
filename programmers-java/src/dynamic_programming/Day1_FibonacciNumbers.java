package dynamic_programming;


public class Day1_FibonacciNumbers {
	
	/**
	*  finbonacci numbers : 1,  1,  2,  3,  5,  8,  13,  21...
	*  f[n] = f[n-1] + f[n-2]
	*  recursion으로 연산시,   연산이 중복됨
	*  단순분할정복
	*/
	int finbonacci (int n) {
		 int[] f = new  int[100];  
		/*
		if(n==1 || n==2) {
			return 1;
		} else {
			return finbonacci(n-2) + finbonacci(n-1);
		}
		*/
			if(n == 1) return 1;
			if(n == 2) return 1;
			return f[n] = finbonacci(n - 1) + finbonacci(n - 2);
	}
	
	/**
	 *  DP(memoization) : recursion으로 연산의 비효율을 해결하기 위해 이미 계산된 f값을 기억
	 *  중간 계산결과를 캐싱함으로써 중복계산을 피함
	 */
   int memoization(int n) {
	   int[] f = new  int[100];  
	   /*
	   if(n==1 || n==2) {
		   return 1;
	   } else if(f[n] > -1) {		// f[n]을 -1로 초기화 했다는 가정,  즉 f[n] > -1은 이미 계산된 값
		   return f[n] ;				// 이미 계산된 값을 재사용
	   } else {							// 새로 계산한 값을 캐시에 저장
		   f[n] = finbonacci(n-2) + finbonacci(n-1);
		   return f[n];
	   }
	   */
		if(n == 1) return 1;
		if(n == 2) return 1;
		if(f[n] != 0) return f[n];
		return f[n] = memoization(n - 1) + memoization(n - 2);
   }
   
   /**
    *  DP(bottom-up) 
    *  구하려는 f[n]에서 시작하는 recursion이 아니라,  1부터 시작해서 순서대로 계산한다.
    *  따라서 f[n]을 계산하려는 시점에 이미  f[n-1]과 f[n-2]가 계산되어 있음
    *  순환식에서 일반적으로 사용
 * @return 
    */
   int bottomUp (int n) {
	   int[] f = new  int[100]; 
	   f[1] = 1;  
	   f[2] = 1;
	   for(int i = 3; i <=n; i++) {
		   f[i]=f[i-1]+f[i-2];
		   return f[i];
	   }
	return n;
   }
	public static void main(String[] args) {
		Day1_FibonacciNumbers fn = new Day1_FibonacciNumbers();
		long startF = System.currentTimeMillis();
	    System.out.println(fn.finbonacci(30));
	    long endF = System.currentTimeMillis();
	    long startM = System.currentTimeMillis();
		System.out.println(fn.memoization(30));
		long endM = System.currentTimeMillis();
		
		System.out.println("피보나치 실행시간 : " + (endF - startF));		// 206
		System.out.println("DP 실행시간 : " + (endM - startM ));			// 128
	}
}
