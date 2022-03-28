package acmicpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class N10828 {
	
	static Stack<Integer> stack = new Stack<>();
	
	public static void main(String[] args) throws FileNotFoundException {
	    File file = new File(N10828.class.getResource("").getPath() + "input.txt");
	    Scanner scan = new Scanner(file);
	    //Scanner scan = new Scanner(System.in);
	    int size = Integer.parseInt(scan.nextLine());
	    for(int i = 0; i < size; i++) {
	    	StringTokenizer st = new StringTokenizer(scan.nextLine());
	    	String command = st.nextToken();
	    	int num = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0; 
	    	stack(command, num);
	    }
	}
	
	private static void stack(String command, int num) {
		if(command.equals("push")) {
			stack.push(num);
		} else if(command.equals("pop")) {
			System.out.println(stack.empty() ? -1 : stack.pop());
		} else if(command.equals("size")) {
			System.out.println(stack.size());
		} else if(command.equals("empty")) {
			System.out.println(stack.empty() ? 1 : 0);
		} else if(command.equals("top")) {
			System.out.println(stack.empty() ? -1 : stack.peek());
		}
	}
}
