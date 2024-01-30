package inflearn.ch07;

// Recursive Function - Fibonacci Numbers
public class N0704 {

    static int[] fibo;
//    private int DFS(int n) {
//        if(n == 1 || n == 2) return fibo[n] = 1;
//        else return fibo[n] = DFS(n - 2) + DFS(n - 1);  // 배열에 저장한 값을 리턴한다.
//    }

//    public static void main(String[] args) {
//        N0704 T = new N0704();
//        int n = 10;
//        fibo = new int[n + 1];
//        T.DFS(n);
//        for(int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
//    }


    private static int DFS(int n) {
        if(n == 1 || n == 2) return fibo[n] = 1;
        else return fibo[n] = fibo[n - 2] + fibo[n - 1];
    }

    public static void main(String[] args) {
        N0704 T = new N0704();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for(int i = 1; i <= n; i++) System.out.print(String.valueOf(DFS(i)) + " ");
    }
}
