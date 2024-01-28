package inflearn.ch07;

import java.util.Scanner;

// Recursive Function - Factorial
public class N0703 {
//    static int answer = 1;
//    private void DFS(int num) {
//        if(num == 0) System.out.println(answer);
//        else  {
//            answer *= num;
//            DFS(num - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        N0703 T = new N0703();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        T.DFS(n);
//    }

    private int DFS(int num) {
        if(num == 1) return 1;
        else return num * DFS(num - 1);
    }

    public static void main(String[] args) {
        N0703 T = new N0703();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.DFS(n));
    }
}
