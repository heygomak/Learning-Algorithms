package inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N0201 {
    private ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < num; i++) {
            if(i == 0) {
                result.add(arr[i]);
            } else {
                if(arr[i] > arr[i - 1]) result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        N0201 T = new N0201();
        Scanner kb = new Scanner(System.in);
        int num = Integer.parseInt(kb.nextLine());
        int[] arr = Arrays.stream(kb.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(T.solution(num, arr).toString().replace("[", "").replace("]", "").replace(",", ""));
    }
}
