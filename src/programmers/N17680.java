package programmers;

import java.util.Arrays;

public class N17680 {

    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) return cities.length * 5;
        int answer = 0;
        String[] arr = new String[cacheSize];
        Arrays.fill(arr, "*");

        for(String city : cities) {
            city = city.toUpperCase();
            for(int i = 0; i < cacheSize; i++) {
                if(city.equals(arr[i]) || arr[i].equals("*") || i == cacheSize - 1) {
                    if(city.equals(arr[i])) answer += 1;
                    else answer += 5;
                    for(int j = i; j > 0; j--) arr[j] = arr[j - 1];
                    arr[0] = city;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        N17680 t = new N17680();
        int n = 3;
        String[] arr = new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(t.solution(n, arr));
    }
}
