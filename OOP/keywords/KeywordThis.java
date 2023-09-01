package keywords;

public class KeywordThis { // constrctor chaining   //parent
	
	
	String color="BLUE";
	
	public void pqr() {
		
		System.out.println("KEywordThis Method");
	}

	public KeywordThis() {
		
		System.out.println("no - arg con");
	}

	public KeywordThis(String name, int a) {

		this();
		System.out.println(name);
		System.out.println(a);
	}

	public KeywordThis(float b) {

		this();
		System.out.println(b);
	}

	public static void main(String[] args) {

		KeywordThis obj = new KeywordThis("java",10);

	}

}
