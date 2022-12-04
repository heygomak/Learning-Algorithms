package baekjoon;

import java.io.*;
import java.nio.file.Paths;
import java.util.Stack;

public class N17608 {
    static Stack<Integer> stack = new Stack<>();
    static int result = 1;

    public static void main(String[] args) throws IOException {
        File file = new File(Paths.get("").toAbsolutePath().toString() + "/src/baekjoon/input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int std = stack.pop();
        while (!stack.empty()) {
            int cur = stack.pop();
            if (std < cur) {
                std = cur;
                result ++;
            }
        }

        System.out.println(result);
    }
}
