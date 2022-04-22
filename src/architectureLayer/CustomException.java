package architectureLayer;

public class CustomException extends Exception {
	public CustomException (String message)
	 {
		super(message);
	}	
	 
	 public CustomException (Exception except)
	 {
		super(except);
	}	

}

