package encap;

public class Employee {

	private int Employee_id;
	private String Employee_name;
	private double Employee_salary;

	public int getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}

	public String getEmployee_name() {
		return Employee_name;
	}

	public void setEmployee_name(String employee_name) {
		Employee_name = employee_name;
	}

	public double getEmployee_salary() {
		return Employee_salary;
	}

	public void setEmployee_salary(double employee_salary) {
		Employee_salary = employee_salary;
	}

	@Override
	public String toString() {
		return "Employee [Employee_id=" + Employee_id + ", Employee_name=" + Employee_name + ", Employee_salary="
				+ Employee_salary + "]";
	}

}
