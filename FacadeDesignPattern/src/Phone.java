
/**
 * The Interface Phone. This interface will be used by various types of phones.
 */
public interface Phone {
	
	/**
	 * Answer calls and returns cost of phone calls being answered
	 *
	 * @param minutes the minutes of the call 
	 * @return the cost of the phone calls
	 */
	double answerCalls(int minutes);
	
	/**
	 * Make Phone calls and return cost of phone calls
	 *
	 * @param minutes the minutes of the call
	 * @return the cost of the phone calls
	 */
	double makeCalls(int minutes);
}
