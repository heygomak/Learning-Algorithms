package acmicpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class N2941 {
	
	static String input = "";
	static String[] words = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(N2941.class.getResource("").getPath() + "input.txt");
		Scanner scan = new Scanner(file);
	    //Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		int cnt = 0;
	    while (input.length() > 0) {
	    	if(!checkPrefix()) {
	    		input = (input.length() > 1) ? input.substring(1, input.length()) : "";
	    	}
	    	cnt ++;
	    }
	    System.out.println(cnt);
	}
	
	 private static boolean checkPrefix() {
		for(String word : words) {
    		if (input.startsWith(word)) {
    			input = input.substring(word.length(), input.length());
    			return true;
    		} 
    	}
		return false;
	}
}
