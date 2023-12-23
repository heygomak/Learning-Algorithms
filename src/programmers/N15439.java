package programmers;
public class N15439 {

    // 테케 23개 중 4개 시간초과
    // 비교할 필요 없는 수까지 모두 비교하므로 시간복잡도 O(n*logn)
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        boolean flag = false;
        int tmp;

        for(int i = 0; i < n - 1; i++) {
            flag = false;
            for(int j = i; j < n - 1; j++) {
                if (numbers[i] < numbers[j + 1]) {
                    numbers[i] = numbers[j + 1];
                    flag = true;
                    break;
                }
            }
            if(!flag) numbers[i] = - 1;
        }
        numbers[n - 1] = -1;

        return numbers;
    }

    public static void main(String[] args) {
        N15439 t = new N15439();
        int[] numbers = new int[]{9, 1, 5, 3, 6, 2};
        for(int i : t.solution(numbers)) System.out.print((Object) (i + " "));
    }
}
