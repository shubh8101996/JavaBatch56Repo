package xyz;

public class EmpDetails {

	 int a = 10;   //as a default
	 String EmpName = "AKASH";

	 protected void getName() {

		System.out.println(EmpName);
	}

	public static void main(String[] args) {
		
		EmpDetails obj=new EmpDetails();
		
		obj.getName();
		System.out.println(obj.a);
		System.out.println(obj.EmpName);
		
		

	}

}
