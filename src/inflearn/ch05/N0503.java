package inflearn.ch05;

import java.util.*;

public class N0503 {
    private int solution(Integer[][] matrix, Integer[] pointer) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        Integer item = new Integer(Integer.valueOf(0));
        for(int y : pointer) {
            for(int x = 1; x< matrix.length; x++) {
                if(matrix[x][y] > 0) {
                    item = matrix[x][y];
                    matrix[x][y] = 0;
                    if(!stack.isEmpty() &&  stack.peek() == item) {
                        stack.pop();
                        result += 2;
                    } else stack.push(item);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0503 T = new N0503();
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt() + 1;
        Integer[][] matrix = new Integer[n1][n1];
        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i < n1; i++) {
            for(int j = 1; j < n1; j++) {
                matrix[i][j] = kb.nextInt();
            }
        }
        int n2 = kb.nextInt();
        Integer[] pointer = new Integer[n2];
        for(int i = 0; i < n2; i++) {
            pointer[i] = kb.nextInt();
        }

        System.out.println(T.solution(matrix, pointer));
    }
}
