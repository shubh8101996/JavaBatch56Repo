package collectionP;

import java.util.ArrayList;
import java.util.List;

public class Arry {
	
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Blue");
		list.remove(1);
	
		
		System.out.println(list.get(1));
		
	}

}
