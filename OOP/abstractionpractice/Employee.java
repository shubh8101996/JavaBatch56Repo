package abstractionpractice;

public abstract class Employee {

	int num = 10;

	static String name = "shubham";

	public Employee() {

		System.out.println("abstract employee class cons");
	}

	void abc() {

		System.out.println("abstract employee class normal method");

	}

	abstract void salary();
	

	

}
