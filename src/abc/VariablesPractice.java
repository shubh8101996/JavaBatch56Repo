package abc;

public class VariablesPractice {

	String emp_name = "Akash Joshi"; // instance var

	static int emp_id = 101; // static var

	public void emp_info() { // non-static

		String emp_address = "Pune"; // local var
		System.out.println(emp_address);
		System.out.println(emp_name);
		System.out.println(emp_id);

	}

	public static void emp_salary() {

		System.out.println(emp_id);

	}

	public static void main(String[] args) {

		VariablesPractice obj = new VariablesPractice();
		System.out.println(obj.emp_name);
		System.out.println(emp_id);

	}

}
