package collectionP;

import java.util.HashSet;

public class SetCollectionP {
	
	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		set.add(10);
		set.add("java");
		set.add("");
		set.add("java");
		set.add("shubham");
		set.add("shubham");
		set.add(true);
		set.add("");
		set.add('c');
		set.add(34.43);
		
		
		set.remove(10);
		
		
//		System.out.println(set.size());
//		
//		set.clear();
//		
		System.out.println(set);
		
		
		
		
	}

}
