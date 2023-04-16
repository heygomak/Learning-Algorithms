package inflearn.ch04;

import java.util.HashMap;
import java.util.Scanner;

public class N0401 {
    private char solution(int n, String str) {
        char result = ' ';
        HashMap<Character, Integer> vote = new HashMap<>();
        for (char x : str.toCharArray()) {
            vote.put(x, vote.getOrDefault(x, 0) + 1);
        }
        /** 문제풀이에 자주 사용하는 map 함수
         *  map.containsKey(key) : key 존재 여부
         *  map.size() : key의 개수
         *  map.remove(key) : 특정 키를 삭제하고 밸류를 리턴
         * */
        int max = Integer.MIN_VALUE;
        for (char key : vote.keySet()) {
            if(vote.get(key) > max) {
                max = vote.get(key);
                result = key;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0401 T = new N0401();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
