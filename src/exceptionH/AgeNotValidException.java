package exceptionH;

public class AgeNotValidException extends RuntimeException {  //user-defined or customer

	public AgeNotValidException(String str){
		
		super(str);
		
	}
	
}
