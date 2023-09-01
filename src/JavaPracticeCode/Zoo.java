package JavaPracticeCode;

public class Zoo {

	Animal animals[];
	int count;

	public Zoo(int capacity) {

		animals = new Animal[capacity];
		count = 0;

	}

	public void addAnimal(Animal animal) {

		if (count < animals.length) {

			animals[count] = animal;
			count++;

		} else {	

			System.out.println("Zoo is Full");
		}

	}
	
	
	public void ShowAnimals() {
		
		System.out.println("Animals in the Zoo ");
		
		for(int i=0;i <count; i++) {
			
			animals[i].makeSound();
			
		}
	}

	public static void main(String[] args) {
		
		
		Zoo zoo=new Zoo(5);
		
		zoo.addAnimal(new Dog("Toomy"));
		zoo.addAnimal(new Cat("Loofy"));
		zoo.addAnimal(new Bird("Crow"));
		
		
		zoo.ShowAnimals();


	}

}
