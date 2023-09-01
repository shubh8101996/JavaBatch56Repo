package abc;

public class JavaClass {

	static String department = "IT"; // static variable

	String name = "shubham"; // instance variable

	void addition() { // belong object non-static members

		int num = 10; // local variable
		int num2 = 20;
		System.out.println(num + num2);

	}

	void multification() {

		int num = 10;
		int num2 = 20;
		System.out.println(num * num2);

	}

	static void substraction() { // class belong (static members)

		int num = 10;
		int num2 = 20;
		System.out.println(num - num2);

		
	}

	public static void main(String[] args) {

		JavaClass obj = new JavaClass(); // object creation syntax
		obj.addition();

		System.out.println(obj.name);
		System.out.println(department);

		substraction();

	}

}
