package exceptionH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionPrac {
	
	
	
	public static void validateAge(int age) {
		
		if(age<18) {
			
			throw new AgeNotValidException("Person not eligible to vote");
			
		}else {
			
			System.out.println("Person eligible to vote");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		validateAge(13);
		
		
	}

}
