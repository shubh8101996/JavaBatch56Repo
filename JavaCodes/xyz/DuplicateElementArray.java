package xyz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementArray {

	static void Num() {

		int array[] = { 23, 65, 23, 45, 65, 78, 56, 45 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					System.out.println(array[j]);
				}

			}
		}
	}

	public static void main(String[] args) {
		
		
		
		

	}

}
