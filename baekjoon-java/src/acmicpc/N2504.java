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
	    		if(item.equals(")")) {
	    			if (stack.isEmpty() || !stack.peek().equals("(")) {
	    				sum = 0;
                    }
	    			if (stack.peek().equals("(")) {
	    				sum += mul;
	    				mul /= 2;
	    			}
	    		} else {
	    			if (stack.isEmpty() || !stack.peek().equals("]")) {
	    				sum = 0;
                    }
	    			if (stack.peek().equals("[")) {
	    				sum += mul;
	    				mul /= 3;
	    			}
	    		}
	    	}
	    }
	    
	    System.out.println(stack.size() != 0 ? 0 : sum);	    
	}
}
