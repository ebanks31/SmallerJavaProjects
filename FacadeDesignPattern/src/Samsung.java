
/**
 * This class is for the Samsung Phone and contain various operations for this phone.
 */
public class Samsung implements Phone {

	/** The access codes. */
	private Boolean accessCodes;
	
	/** The Constant COSTPERMINUTEMAKE. */
	private static final double COSTPERMINUTEMAKE = .50 ;
	
	/** The Constant COSTPERMINUTEANSWER. */
	private static final double COSTPERMINUTEANSWER = .40 ;
    
    /** The phone utility. */
    private PhoneUtility phoneUtility;
	
	/**
	 * Instantiates a new samsung.
	 */
	public Samsung()
	{
		phoneUtility = new PhoneUtility();
	}
	
	/**
	 * Gets the access codes.
	 *
	 * @return the access codes
	 */
	public Boolean getAccessCodes() {
		return accessCodes;
	}
	
	/**
	 * Toggle access code on.
	 *
	 * @param accessCodes the access codes
	 */
	public void toggleAccessCodeOn(Boolean accessCodes)
	{
		System.out.println("Samsung has toggled the access codes");
		this.accessCodes = accessCodes;
	}

	/* (non-Javadoc)
	 * @see Phone#makeCalls(int)
	 */
	@Override
	public double makeCalls(int minutes) {
		System.out.println("Samsung has made the calls for " + minutes + " minutes");
		double finalcost = 0;
		for (int i = 1 ; i <= minutes; i++)
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
		System.out.println("Samsung has made answered the calls for " + minutes + " minutes");
		
		double finalcost = 0;
		for (int i = 1; i <= minutes; i++)
	    {
	    
	    	finalcost += COSTPERMINUTEANSWER;
	    }
		
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(finalcost);
	    return roundCost;

		
	}
	


}
