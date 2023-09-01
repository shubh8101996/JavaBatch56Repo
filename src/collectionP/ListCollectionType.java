package collectionP;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCollectionType {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("");
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
		list.add("");
		list.add(09);

//		for (Object a : list) {
//
//			System.out.println(a);
//		}

//		System.out.println(list.get(6));
//		System.out.println(list.size());
//		list.clear();

//		System.out.println(list.isEmpty());

//		list.remove(5);
//		
//		System.out.println(list);
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		

	}

}
