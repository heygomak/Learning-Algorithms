package inflearn.ch06;

import java.util.Arrays;
import java.util.Scanner;

// 결정 알고리즘 
// Binary Search 개념을 토대로 최적의 해를 찾기 위해 답을 좁혀가는 방법
public class N0610 {

    static int n, m;
    static int[] arr;

    private int solution() {
        Arrays.sort(arr);
        int answer = 0, mid = 0;
        // 거리 자체를 lt, rt로 셋팅한다.
        // 주의할점은 lt = arr[0] 이어서는 안된다. ex) arr = [5, 8, 12, 14], c = 3 이면 최대거리는 3이기 때문
        int lt = 1, rt = arr[n -1];

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            // 최대거리 = mid 로 가정하고 배치할 수 있는 말의 마리수를 충족하는지 판단
            if(getCount(mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    private int getCount(int target) {
        // 첫번째 좌표에 무조건 첫번째 말을 배치한다.
        int ep = arr[0];
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep > target) {  // 두 말의 거리가 mid 값 이상인지를 판단.
                cnt ++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        N0610 T = new N0610();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution());
    }
}
