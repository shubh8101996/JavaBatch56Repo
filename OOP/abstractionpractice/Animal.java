package abstractionpractice;

public interface Animal {
	
	
	  int a=100;
	
	 void sound();  //public and abstarct
	 
	 void color();
	 
	 
	 static void abc() {
		 
		 System.out.println("this is my static method");
	 }
	 
	default void xyz() {
		 
		System.out.println("this is def method");
		 
	 }
	

}
