package collectionP;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet link=new LinkedHashSet<>();
		
		link.add(10);
		link.add("shubham");
		link.add("");
		link.add(10.2);
		link.add('c');
		link.add("");
		link.add('b');
		link.add("shubham");
		link.add(10.2);
		link.add(23);


		Iterator itr=link.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}
	

}
