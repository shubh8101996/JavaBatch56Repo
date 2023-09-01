package polymorph;

public class Bike extends Vehical {

	
	String wheels(int a) {

		System.out.println("Bike Class no arg Method  " +a);
		return name;

	}
	
	public void wheels(float a) {
		
		System.out.println("Class Bike Method");
	}
	

	public static void main(String[] args) {

		Bike b=new Bike();
		b.wheels(10);
		

	}

}
