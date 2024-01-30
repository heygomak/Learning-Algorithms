package programmers;

import java.util.ArrayList;
import java.util.List;

public class N84512 {
    static String[] arr = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();

    static void dfs(String str, int depth) {
        list.add(str);
        if(depth == 5) return;
        else {
            for (int i = 0; i < arr.length; i++) {
                dfs(str + arr[i], depth + 1);
            }
        }
    }
    public static int solution(String word) {
        int answer = 0;

        dfs("", 0);
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N84512 t = new N84512();
        String word = "EIO";
        System.out.println(solution(word));
    }
}
