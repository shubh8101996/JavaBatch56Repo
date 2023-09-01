package collectionP;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeP {

	public static void main(String[] args) {

		TreeSet link = new TreeSet<>();

		link.add(50);
		link.add(23);
		link.add(4);
		link.add(4);
		link.add(20);
		link.add(34);
		link.add(4);
		
	
		Iterator itr = link.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		
		System.out.println(	link.descendingSet());
	

	}

}
