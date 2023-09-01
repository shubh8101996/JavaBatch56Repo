package abstractionpractice;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Barking");
	}

	@Override
	public void color() {
		
		System.out.println("Golden");
	}

}
