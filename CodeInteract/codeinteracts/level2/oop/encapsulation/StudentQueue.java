package codeinteracts.level2.oop.encapsulation;

import java.util.PriorityQueue;
import java.util.Queue;

public class StudentQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(0);
		queue.add(2);
		queue.add(4);
		queue.add(6);
		while(!queue.isEmpty())
		{
			System.out.println(queue.peek());
			System.out.println(queue.poll());
		}
		}

}

