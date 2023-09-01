package InheritancePractice;

public class Animal { // parent

	public Animal() {

		System.out.println("Animal Class Construtor");

	}

	void xyz() {

		System.out.println("Animal Class method named xyz");

	}

	String name = "Animal Name";

	public void sound() {

		System.out.println("Animal Class method named sound");

	}

	void abc() {

		System.out.println("Animal Class method named abc");
	}

	public static void main(String[] args) {

		Animal animal = new Animal();

	}

}
