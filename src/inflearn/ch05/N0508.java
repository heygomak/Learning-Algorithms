package inflearn.ch05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/** (순서, 중요도) 를 나타내는 객체를 2차원 배열 대신 생성자를 사용할 수 있다.
 * ex) Queue<Person]> queue = new LinkedList<>();
        class Person {
            int idx;
            int priority;
            public Person(int idx, int priority) {
                this.idx = idx;
                this.priority = priority;
            }
        }
 */
public class N0508 {
    private int solution(int n, int m, int[][] arr) {
        int result = 0;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) queue.add(arr[i]);
        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            for(int[] target : queue) {
                if(target[1] > tmp[1]) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                result++;
                if(tmp[0] == m) return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0508 T = new N0508();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
