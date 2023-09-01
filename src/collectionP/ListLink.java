package collectionP;

import java.util.LinkedList;

public class ListLink {
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList<>();
		
		list.add(30);
		list.add(10);
		list.add("");
		list.add("shubham");
		list.add("shubham");
		list.add("");
		list.add("java");
		list.add("");
		list.add("shubham");
		list.add(true);
		list.add(23.43f);
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		
		
		list.addFirst("shu");
		list.addLast("linked");

		
	}

}
