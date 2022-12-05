package baekjoon;

import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class N11866 {
    public static void main(String[] args) throws IOException {
        File file = new File(Paths.get("").toAbsolutePath().toString() + "/src/baekjoon/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String result = "<";

        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i < n + 1; i++) {
            que.add(i);
        }
        while (!que.isEmpty()) {
            for(int i = 0; i < k - 1; i++) {
                que.add(que.poll());
            }
            result = result + que.poll();
            if(que.size() > 0) {
                result = result + ", ";
            }
        }
        System.out.println(result + ">");
    }
}
