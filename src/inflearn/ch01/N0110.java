package inflearn.ch01;

import java.util.Scanner;

public class N0110 {
    private String solution(String s, String t) {
        // Sol 1) 나의 풀이 : 이중 for문 완전 탐색, abs 값으로 계산
        StringBuilder result = new StringBuilder();
        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(t)) result.append("0");
            else {
                int distance = s.length();
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j].equals(t) && Math.abs(j - i) < distance) {
                        distance = Math.abs(j - i);
                    }
                }
                result.append(String.valueOf(distance));
            }
            if (i < arr.length - 1) result.append(" ");
        }

        // Sol 2) for문 2번 (앞에서 뒤로 한번, 뒤에서 앞으로 한번),
        // 둘중의 min 값으로 계산

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        N0110 T = new N0110();
        Scanner kb = new Scanner(System.in);
        String[] str = kb.nextLine().split(" ");
        System.out.println(T.solution(str[0], str[1]));
    }
}
