package programmers;

import java.util.Arrays;

public class N43238 {

    // [ Binary Search ]
    // 💡 입국 심사를 언제 마칠지에 초점을 두지 말고, 현재 시간을 기준으로 몇명이 최대로 마칠 수 있는가?
    // min = 0, max = 모든 인원이 최대 시간으로 심사를 하는 시간
    // 누적합이 64비트 이상이면 오버플로우 예상되므로 long 자료형 선언할 것
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long lt = 0, rt = (long) times[times.length - 1] * n;  // 최소시간, 최대시간
        long answer = 0, mid = 0;      // 입국심사에 통과한 사람, 이분탐색 중간값

        while (lt <= rt) {
            long count = 0;
            mid = (lt + rt) / 2;
            for(int time : times) count += mid / time;
            if(count < n) lt = mid + 1;
            else {
                rt = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        N43238 t = new N43238();
        int n = 6;
        int[] times = new int[]{7, 10};
        System.out.println(t.solution(n, times));
    }
}
