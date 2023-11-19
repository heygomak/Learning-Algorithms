package inflearn.ch05;

import java.util.Scanner;
import java.util.Stack;

public class N0502 {
    private String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(char item : str.toCharArray()) {
            if(item == ')'){
                if(!stack.isEmpty()) {
                    char target = stack.pop();
                    while (target != '(') target = stack.pop();
                    // while (stack.pop() != '(');
                }
            } else stack.push(item);
        }
        while (!stack.isEmpty()) {
            char item = stack.pop();
            if(item != '(' && item != ')') {
                result = String.valueOf(item).concat(result);
            }
        }
        // for(int i = 0; i < stack.size(); i++) result += stack.get(i);
        return result;
    }

    public static void main(String[] args) {
        N0502 T = new N0502();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
