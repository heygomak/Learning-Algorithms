package acmicpc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class N2504 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(N2504.class.getResource("").getPath() + "input.txt");
	    Scanner scan = new Scanner(file);
	    //Scanner scan = new Scanner(System.in);
	    
	    int sum = 0;
	    int mul = 1;
	    String[] input = scan.nextLine().split("");
	    Stack<String> stack = new Stack<String>();
	    
	    for(String item: input) {
	    	if (item.equals("(") || item.equals("[")) {
	    		stack.push(item);
	    		mul *= item.equals("(") ? 2 : 3;  
	    	} else {
	    		if (!stack.empty()) {
					if (item.equals(")")) {
						if (stack.peek() == "(") {
							stack.pop();
						} else {
							stack.push(item);
						}
	    			} else if (item.equals("]")) {
	    				if (stack.peek() == "[") {
							stack.pop();
							
						} else {
							stack.push(item);
						}
	    			}
	    		} else {
	    			stack.push(item);
	    		}
	    	}
	    }
	    
	    System.out.println(stack.size() != 0 ? 0 : sum);	    
	}
}
