package abstractionpractice;

public class Car extends Vehicle {

	@Override
	void wheels() {
		
		System.out.println("4 wheels");
		
	}

	@Override
	void start() {
		
		System.out.println("start functionality");
	}

	@Override
	void stop() {
		
	}

	@Override
	void accel() {
		
		System.out.println("");
		
	}
	
	
	public static void main(String[] args) {
		
		Car c=new Car();
		c.wheels();
		c.start();
		
	}
	

}
