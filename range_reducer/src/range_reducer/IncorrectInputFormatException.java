package range_reducer;

public class IncorrectInputFormatException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectInputFormatException(String errorMessage) {
	    super(errorMessage);
	}
	
	public IncorrectInputFormatException(String errorMessage, Throwable err) {
	    super(errorMessage, err);
	}

}
