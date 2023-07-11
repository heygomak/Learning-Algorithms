package inflearn.ch05;

import java.util.Scanner;
import java.util.Stack;

public class N0501 {
    private String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(char item : str.toCharArray()) {
            if(item == '(') stack.push(item);
            else {
                if(stack.empty())  return "NO";
                stack.pop();
            }
        }
        return stack.empty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        N0501 T = new N0501();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
