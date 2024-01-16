package inflearn.ch06;

import java.util.*;

// 결정 알고리즘 
// Binary Search 개념을 토대로 최적의 해를 찾기 위해 답을 좁혀가는 방법
public class N0609 {

    static int n, m;
    static int[] arr;

    private int solution() {
        Arrays.sort(arr);
        int answer = 0, mid = 0;
        int lt = arr[n - 1];                // 최소값 = 최소 용량이 가장 큰 곡을 담을 수 있어야함.(m = n 인 경우)
        int rt = Arrays.stream(arr).sum();  // 최대값 = 모든 곡을 합친 값.(m = 1 인 경우)

        while (lt <= rt) {
            mid = (lt + rt) / 2;
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
        int sum = 0, cnt = 1;
        for (int t : arr) {
            if (sum + t > target) {
                sum = t;
                cnt ++;
            } else sum += t;
        }
        return cnt;
    }

    public static void main(String[] args) {
        N0609 T = new N0609();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution());
    }
}
