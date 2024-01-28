package inflearn.ch07;

import java.util.Scanner;

// Recursive Function - Stack Frame(Binary Number)
public class N0702 {
    private void DFS(int num) {
        if(num == 0) return;
        else  {
            DFS(num / 2);
            System.out.print(num % 2);
        }
    }

    public static void main(String[] args) {
        N0702 T = new N0702();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.DFS(n);
    }
}
