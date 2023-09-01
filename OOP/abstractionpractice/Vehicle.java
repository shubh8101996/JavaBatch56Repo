package abstractionpractice;

public abstract class Vehicle {
	
	String a;
	
	public Vehicle() {
		
		System.out.println("Con Vehicle");
	}

	 abstract void wheels();

	abstract void start();

	abstract void stop();

	abstract void accel();

	static void abc() {

		System.out.println(" abstract Vehicle class method");
	}

}
