package programmers;

import java.util.ArrayList;

public class N12899 {
    public String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }

        return answer;
    }

    public static void main(String[] args) {
        N12899 t = new N12899();
        int n = 28;
        System.out.println(t.solution(n));
    }
}
