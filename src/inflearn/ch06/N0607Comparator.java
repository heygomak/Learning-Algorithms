package inflearn.ch06;

import java.util.*;

/**
 * Comparator
 *  -> compare(T o1, o2)
 */
class N0607Comparator {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]) return o1[1] - o2[1];  // x가 같으면 y 기준 정렬
                else return o1[0] - o2[0];              // x가 다르면 x 기준 정렬
            }
        });

        for(int[] o : arr) System.out.println(o[0]+" "+o[1]);
    }
}

