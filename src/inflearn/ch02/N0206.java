package inflearn.ch02;

import java.util.Scanner;

public class N0206 {

    StringBuilder sb = null;

    public boolean isPrime(int num) {
        if(num == 1) return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    private int solution(String str) {
        int n = Integer.parseInt(String.valueOf(new StringBuilder(str).reverse()));
        return isPrime(n) ? n : 0;
    }

    public static void main(String[] args) {
        N0206 T = new N0206();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String result = "";
        for(int i = 0; i < n; i++) {
            int rtn = T.solution(kb.next());
            if(rtn > 0) result += (String.valueOf(rtn) + " ");
        }
        System.out.println(result.trim());
    }
}
