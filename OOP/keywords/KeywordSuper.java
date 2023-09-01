package keywords;

public class KeywordSuper extends KeywordThis { // child

	public KeywordSuper() {

		super(11.23f);

	}

	String color = "RED";

	public void pqr() {

		System.out.println("KeywordSuper Method");
	}

	public void colorProperties() {

		System.out.println("Super Method");
		System.out.println(super.color);
		super.pqr();
	}

	public static void main(String[] args) {

		KeywordSuper obj = new KeywordSuper();
		obj.colorProperties();

	}

}
