
/**
 * This class is for the HTC Phone and contain various operations for this phone. 
 */
public class HTC implements Phone {

	private Boolean backlight;
	private static final double COSTPERMINUTEMAKE = .70 ;
	private static final double COSTPERMINUTEANSWER = .60 ;
    private PhoneUtility phoneUtility;
	
	/**
	 * Instantiates a new htc.
	 */
	public HTC()
	{
		phoneUtility = new PhoneUtility();
	}
	
	/**
	 * Gets the backlight.
	 *
	 * @return the backlight
	 */
	public Boolean getBacklight() {
		return backlight;
	}

	/**
	 * Turn on back light.
	 *
	 * @param backlight the backlight
	 */
	public void TurnOnBackLight(Boolean backlight)
	{
		this.backlight = backlight;
		System.out.println("HTC has toggled the backlight");
	}
	
	/* (non-Javadoc)
	 * @see Phone#makeCalls(int)
	 */
	@Override
	public double makeCalls(int minutes) {
		
		System.out.println("HTC has made the calls for " + minutes + " minutes");
		
		double finalcost = 0;
		for (int i = 1; i <= minutes; i++)
	    {
	    
	    	finalcost += COSTPERMINUTEMAKE;
	    }
		
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(finalcost);
	    return roundCost;

	}

	/* (non-Javadoc)
	 * @see Phone#answerCalls(int)
	 */
	@Override
	public double answerCalls(int minutes) {
		System.out.println("HTC has made the calls for " + minutes + " minutes");
		double finalcost = 0;
		
		for (int i = 1; i <= minutes; i++)
	    {
	    
	    	finalcost += COSTPERMINUTEANSWER;
	    }
		
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(finalcost);
	    return roundCost;
	}
	


}
