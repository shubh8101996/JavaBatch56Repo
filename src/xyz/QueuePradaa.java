package xyz;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePradaa {

	public static void main(String[] args) {

		PriorityQueue ou = new PriorityQueue<>();

		ou.add(10);
		ou.add(20);
		ou.add(99);
		ou.add(3);
		ou.add(63);

		System.out.println(ou);
		
		
		System.out.println(ou.remove(1));
		
//		ou.poll();
//		
//		System.out.println(ou);
//		
//		System.out.println("-------------------------------");

//		ArrayDeque ou1 = new ArrayDeque();
//
//		ou1.add(10);
//		ou1.add(20);
//		ou1.add("");
//		ou1.add(9);
//		ou1.add(53);
//		ou1.add(23);
//
//		System.out.println(ou1);

	}

}
