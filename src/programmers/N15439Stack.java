package programmers;

import java.util.*;

public class N15439Stack {

    // 시간복잡도 O(2n)
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[i] > numbers[stack.peek()]) {
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        N15439Stack t = new N15439Stack();
        int[] numbers = new int[]{9, 1, 5, 3, 6, 2};
        for(int i : t.solution(numbers)) System.out.print((Object) (i + " "));
    }
}
