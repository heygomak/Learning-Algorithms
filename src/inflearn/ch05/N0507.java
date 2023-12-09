package inflearn.ch05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N0507 {
    private String solution(String require, String total) {
        Queue<Character> queue = new LinkedList<>();
        for(char x: require.toCharArray()) queue.add(x);
        for(char x: total.toCharArray()){
            if(queue.contains(x)) {
                // 일치하지 않는 순서를 발견한즉시 리턴하여 메모리 절감한다.
                if(x != queue.poll()) return "NO";
            }
        }
        if (!queue.isEmpty()) return "NO";
            return "YES";
    }

    public static void main(String[] args) {
        N0507 T = new N0507();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.solution(kb.nextLine(), kb.nextLine()));
    }
}