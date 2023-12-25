package programmers;

import java.util.*;

import static java.util.Arrays.copyOfRange;

public class N131127 {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        List<String> wantList =new ArrayList<>();
        List<String> tmp = null;

        for(int i = 0; i < want.length;i++){
            for(int j = 0; j < number[i]; j++){
                wantList.add(want[i]);
            }
        }

        for(int i = 0; i <= discount.length - 10; i++){
            tmp = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(discount, i, i+10)));
            for(String a:wantList) tmp.remove(a);
            if(tmp.isEmpty()) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        N131127 t = new N131127();
        String[] want = new String[]{"banana", "apple", "rice", "pork", "pot"};
        int[] number = new int[]{3, 2, 2, 2, 1};
        String[] discount = new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(t.solution(want, number, discount));
    }
}
