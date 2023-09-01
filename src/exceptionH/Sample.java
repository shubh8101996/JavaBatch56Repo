package exceptionH;

public class Sample {

	public static void main(String[] args) {
		
		
		int a=10;
		
		try {
		System.out.println(a/0);
		}catch (ArithmeticException e) {
			
//			e.printStackTrace();  //ex name, ex dec ,ex trace
//			System.out.println(e.getMessage()); //ex dec
//			System.out.println(e.toString());
			
		
		}
		
		System.out.println("Hiiieee");
		

		
	}

}
