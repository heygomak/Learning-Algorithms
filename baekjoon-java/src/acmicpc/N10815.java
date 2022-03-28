package acmicpc;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class N10815 {

	static int n;
	static int[] arr1;
	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("java.class.path").toString() + "\\acmicpc\\input.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		n = Integer.parseInt(reader.readLine());
		arr1 = Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int m = Integer.parseInt(reader.readLine());
		int[] arr2 = Stream.of(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		Arrays.sort(arr1);

		for (int i = 0; i < m; i++) {
			// binary search
			if (binarySearch(arr2[i]) != -1) {
				System.out.print(1 + " ");
			} else {
				System.out.print(0 + " ");
			}
		}
	}

	private static int binarySearch(int target) {
		int start = 0;
		int end = n - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if(arr1[mid] < target) {
				start = mid + 1;
			} else if (arr1[mid] > target) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
