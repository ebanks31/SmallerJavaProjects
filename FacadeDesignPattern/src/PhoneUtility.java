import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * The Class PhoneUtility. Utility Class for this project.
 */
public class PhoneUtility {

	/**
	 * Instantiates a new phone utility.
	 */
	public PhoneUtility()
	{
		
	}
	
	/**
	 * Gets the two digits double values.
	 *
	 * @param cost the cost
	 * @return the two digits double values
	 */
	public double getTwoDigitsDoubleValues(double cost)
	{
	    BigDecimal bigDecimal = new BigDecimal(cost);
	    bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
	    return bigDecimal.doubleValue();
	}
}
