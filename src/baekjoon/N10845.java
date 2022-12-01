package baekjoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class N10845 {
	
	static Queue<Integer> queue = new LinkedList<Integer>();
	static int pointer = -1;		// 가장 마지막에 queue에 추가된 값 저장
	
	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File(N10845.class.getResource("").getPath() + "input.txt");
		//Scanner scan = new Scanner(file);
	    Scanner scan = new Scanner(System.in);
	    int size = Integer.parseInt(scan.nextLine());	
	    for (int i = 0; i < size; i++) {
	    	StringTokenizer st = new StringTokenizer(scan.nextLine());
	    	String command = st.nextToken();
	    	int num = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0; 
	    	queue(command, num);
	    }
	}	
	
	private static void queue(String command, int num) {
		if(command.equals("push")) {
			queue.offer(num);
			pointer = num;
		} else if(command.equals("pop")) {
			System.out.println(!queue.isEmpty() ? queue.poll() : -1);
		} else if(command.equals("size")) {
			System.out.println(queue.size());
		} else if(command.equals("empty")) {
			System.out.println(!queue.isEmpty() ? 1 : 0);
		} else if(command.equals("front")) {
			System.out.println(!queue.isEmpty() ? queue.peek() : -1);
		} else if(command.equals("back")) {
			System.out.println(!queue.isEmpty() ? pointer : -1);
		}
	}
}
