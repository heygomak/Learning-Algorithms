package programmers;

import java.util.Map;
import java.util.TreeMap;

public class N92341 {
    static int[] fees;
    static String[] records;

    public int[] solution(int[] fees_input, String[] records_input) {
        fees = fees_input;
        records = records_input;
        Map<String, String> map = new TreeMap<String, String>();
        for(String record : records) {
            String carNumber = record.split(" ")[1];
            String time = record.split(" ")[0];
            if(map.containsKey(carNumber)) {
                map.put(carNumber, map.get(carNumber) + "|" + time);
            } else {
                map.put(carNumber, time);
            }
        }

        int idx = 0;
        int[] answer = new int[map.size()];
        for(String key : map.keySet()) {
            int time = 0;
            String[] arr = map.get(key).split("\\|");
            for(int i = 0; i < arr.length; i++) {
                if((i == 0 && arr.length > 1) || (i < arr.length - 1 && i % 2 == 0)) {
                    time += calcTimes(arr[i], arr[i + 1]);
                } else if (i == arr.length - 1 && i % 2 == 0){
                    time += calcTimes(arr[i], "23:59");
                }
            }
            answer[idx] = calcFees(time);
            idx ++;
        }

        return answer;
    }

    public static int calcTimes(String inTime, String outTime) {
        return 60 * (Integer.parseInt(outTime.split(":")[0]) - Integer.parseInt(inTime.split(":")[0])) +
                (Integer.parseInt(outTime.split(":")[1]) - Integer.parseInt(inTime.split(":")[1]));
    }

    public static int calcFees(int time) {
        return (time <= fees[0]) ? fees[1] :
                fees[1] + (int) Math.ceil((double)(time - fees[0]) / (double)fees[2]) * fees[3];
    }
}