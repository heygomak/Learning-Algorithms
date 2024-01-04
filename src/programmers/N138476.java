package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class N138476 {
    public int solution(int k, int[] tangerine) {
        int answer = 0, cnt = 0;
        ArrayList<Integer> valueList  = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int item : tangerine) map.put(item, map.getOrDefault(item, 0) + 1);
        for(int key: map.keySet()) valueList.add(map.get(key));
        Collections.sort(valueList, Collections.reverseOrder());

        for(int item : valueList) {
            if (cnt < k) {
                cnt += item;
                answer ++;
            } else return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        N138476 t = new N138476();
        int k = 6;
        int[] tangerine = new int[]{1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(t.solution(k, tangerine));
    }
}
