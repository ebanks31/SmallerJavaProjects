
/**
 * The Class LessThanZeroException. The class is the exception class when a parameter is less than Zero for Factorial Method.
 */
public class LessThanZeroException extends Exception {

	/**
	 * Instantiates a new less than zero exception.
	 */
	public LessThanZeroException() {}
	
	/**
	 * Instantiates a new less than zero exception.
	 *
	 * @param message the message
	 */
	public LessThanZeroException(String message)
	{
		super(message);
	}
}
