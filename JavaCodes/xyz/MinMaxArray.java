package xyz;

public class MinMaxArray {

	static void MaxNum() {

		int arr[] = { 23, 56, 32, 765, 23 };
		int max = arr[0];

		for (int a : arr) {

			if (a > arr[0]) {

				max = a;

			}
		}

		System.out.println(max);
	}

	static void MinNum() {

		int arr[] = { 23, 56, 32, 765, 13 };
		int max = arr[0];

		for (int a : arr) {

			if (a < arr[0]) {

				max = a;

			}
		}

		System.out.println(max);
	}

	public static void main(String[] args) {

		MinNum();
		MaxNum();

	}

}
