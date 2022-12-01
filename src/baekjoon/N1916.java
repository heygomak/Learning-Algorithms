package baekjoon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class N1916 {

	static int n;
	static int m;
	static ArrayList<int[]> cost;
	static int start;
	static int end;

	public static void main(String[] args) throws IOException {
		File file = new File(N1916.class.getResource("").getPath() + "input.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		n = Integer.parseInt(reader.readLine());
		m = Integer.parseInt(reader.readLine());
	    for (int i = 0; i < m; i++) {
			cost.add(Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
	    }
		int[] target = Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		start = target[0];
		end = target[1];
	}
}
