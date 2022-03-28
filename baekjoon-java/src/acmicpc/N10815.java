package acmicpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream; 

public class N10815 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(N10815.class.getResource("").getPath() + "input.txt");
	    Scanner scan = new Scanner(file);
	    //Scanner scan = new Scanner(System.in);
	    
	    int n = Integer.parseInt(scan.nextLine());
	    int[] arr1 = Stream.of(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    int m = Integer.parseInt(scan.nextLine());
	    int[] arr2 = Stream.of(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    int[] arr3 = arr2.clone();
	    int[] answer = new int[m];
	    int pointer = 0;
	    
	    Arrays.sort(arr1);
	    Arrays.sort(arr3);
	   
	    for(int i = 0; i < m; i++) {
	    	// binary search
	    	if (arr3[i] == arr1[pointer]) {
	    		pointer ++;
    			//arr2[Arrays.asList(arr2).indexOf(arr3[i])] = 1;
    		} else if (arr3[i] > arr1[pointer]) {
    			//arr2[Arrays.asList(arr2).indexOf(arr3[i])] = 0;
    		}
	    }
	    
	    System.out.println(Arrays.toString(answer));
	    
	}
}
