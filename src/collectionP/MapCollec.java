package collectionP;

import java.util.HashMap;

public class MapCollec {
	
	public static void main(String[] args) {
		
		HashMap hmap=new HashMap<>();
		
		hmap.put(1, "Java");
		hmap.put(2, "MAnual");
		hmap.put(3, "SQL");
		hmap.put(4, "API");
		hmap.put(5, "Selenium");
		hmap.put(6, "Appium");

	
		System.out.println(hmap);
		
		hmap.remove(4);
		
		System.out.println(hmap.get(3));
		
		
	}

}
