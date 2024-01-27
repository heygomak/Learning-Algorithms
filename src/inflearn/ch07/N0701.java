package inflearn.ch07;

import java.util.Scanner;

// Recursive Function - Stack Frame
public class N0701 {

//    static int N;
//    private void solution(int num) {
//        if(num <= N) {
//            System.out.print(num + " ");
//            solution(num + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        N0701 T = new N0701();
//        Scanner kb = new Scanner(System.in);
//        N = kb.nextInt();
//        T.solution(1);
//    }

    private void DFS(int num) {
        if(num == 0) return;
        else  {
            DFS(num - 1);   // 복귀주소, 지역변수, 매개변수
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        N0701 T = new N0701();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
