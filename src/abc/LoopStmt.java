package abc;

public class LoopStmt {

	public static void main(String[] args) {

//		int num = 10;
//
//		while (num <= 50) {  //51 <=50
//
//			System.out.println(num);
//			num++;
//		}

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {

				continue;
			}

			System.out.println(i);
		}

	}

}
