package abc;

public class MethodsPractice {

	public MethodsPractice() {
		
		System.out.println("no-arg con");
	}
	

	MethodsPractice(String a, String b) {  //para-con

		System.out.println(a + " " + b);

	}

	void addition(int a, int b) { // parameter

		System.out.println(a + b);

	}
	
		void addition1() {
			
			int a=10;
			int b=20;
			
			System.out.println(a+b);
		}

	void student_info(int stu_id, String stu_name, double stu_marks) {

		System.out.println(stu_id + " " + stu_name + " " + stu_marks);

	}

	public static void main(String[] args) {

		MethodsPractice obj = new MethodsPractice();
		
		obj.addition1();
		obj.addition1();


//		obj.student_info(101, "shubham", 75); // arguments
//		obj.student_info(102, "Akshay", 80);
//	}
		
	}

}
