package programmers;

public class N42747 {
    public static int solution(int[] citations) {
        int max = 0, tmp = 0;
        int n = citations.length;

        for(int i = 1; i < n; i++) {
            tmp = citations[i];
            int j = i - 1;
            for(j = i - 1; j >= 0; j--) {
                if(citations[j] > tmp) citations[j + 1] = citations[j];
                else break;
            }
            citations[j + 1] = tmp;
        }

        for(int i = 0; i < n; i++) {
            if(citations[i] >= n - i) {
                max = citations[i];
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        N42747 T = new N42747();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.print(solution(citations));
    }
}
