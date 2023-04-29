package inflearn.ch04;

import java.util.HashMap;
import java.util.Scanner;

public class N0402 {
    private boolean solution(String a, String b) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String item : a.split("")) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        for(String key : map.keySet()) {
            int cnt = b.length() - b.replace(key, "").length();
            if(map.get(key) != cnt) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        N0402 T = new N0402();
        Scanner kb = new Scanner(System.in);
        String a = kb.nextLine();
        String b = kb.nextLine();
        System.out.println(T.solution(a, b) ? "YES" : "NO");
    }
}
