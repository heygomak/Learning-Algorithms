package inflearn.ch02;

import java.util.Arrays;
import java.util.Scanner;

public class N0208_1 {
    private int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        int prevScore = 0, rank = 0, equalRank = 0;
        int[] sortArr = arr.clone();    // ArrayList -> primitive type

        // 1. 점수 내림차순 정렬
        Arrays.sort(sortArr);
        for(int i = 0; i < sortArr.length / 2; i++) {
            int tmp = sortArr[i];
            sortArr[i] = sortArr[sortArr.length -1 -i];
            sortArr[sortArr.length -1 -i] = tmp;
        }

        // 2. 자기 점수에 해당하는 등수 탐색
        for (int nowScore : sortArr) {
            if (prevScore == nowScore) equalRank++;
            else {
                rank += equalRank + 1;
                equalRank = 0;
                prevScore = nowScore;
            }
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == nowScore) {
                    arr[i] = -1;
                    result[i] = rank;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0208_1 T = new N0208_1();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(arr)) System.out.print(x + " ");
    }
}
