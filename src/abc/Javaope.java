package abc;

public class Javaope {

	public static void main(String[] args) {

		int age = 19;

		String gender = "male";

		if (age > 18) {   //19 > 18

			if (gender == "male") {   // "female" == "male"

				System.out.println("go to the male section");

			} else {

				System.out.println("go to the female section");

			}

		} else {

			System.out.println("go to the kids section");
		}

	}
}
