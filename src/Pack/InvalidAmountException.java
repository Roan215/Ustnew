package Pack;

public class InvalidAmountException extends Exception {
	
	public InvalidAmountException(int amount) {
		super(amount+" is invalid amount");
		
	}

}
