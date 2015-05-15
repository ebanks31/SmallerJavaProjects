
/**
 * This class is for the IPhone Phone and contain various operations for this phone.
 */
public class IPhone implements Phone{

	private static final double COSTPERMINUTEMAKE = .90 ;
	private static final double COSTPERMINUTEANSWER = .80 ;

	PhoneUtility phoneUtility;
	
	/**
	 * Instantiates a new iphone.
	 */
	public IPhone()
	{
		phoneUtility = new PhoneUtility();
	}
	
	
	Boolean fingerScan;
	
	/**
	 * Gets the fingerscan.
	 *
	 * @return the fingerscan
	 */
	public Boolean getFingerscan() {
		return fingerScan;
	}

	/**
	 * Toggle finger scan.
	 *
	 * @param fingerScan the finger scan
	 */
	public void toggleFingerScan(Boolean fingerScan)
	{
		System.out.println("IPhone Finger Scan has been toggled");
		this.fingerScan = fingerScan;

	}
	
	/* (non-Javadoc)
	 * @see Phone#makeCalls(int)
	 */
	@Override
	public double makeCalls(int minutes) {
		System.out.println("IPhone has made the calls for " + minutes + " minutes");
		double finalcost=0;
		for (int i = 1 ; i <= minutes; i++)
	    {
	    
	    	finalcost += COSTPERMINUTEANSWER;
	    }
		
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(finalcost);
	    return roundCost;

		
	}

	/* (non-Javadoc)
	 * @see Phone#answerCalls(int)
	 */
	@Override
	public double answerCalls(int minutes) {
		System.out.println("IPhone has answer the calls for " + minutes + " minutes");
		double finalcost=0;
		
		for (int i = 1; i <= minutes; i++)
	    {
	    
	    	finalcost += COSTPERMINUTEMAKE;
	    }
		
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(finalcost);
	    return roundCost;

		
	}
	



}
