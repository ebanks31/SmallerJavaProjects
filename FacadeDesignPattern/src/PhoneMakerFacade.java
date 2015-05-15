
/**
 * The Class PhoneMakerFacade. The Facade class for IPhone, Samsung, and HTC Phones. 
 */
public class PhoneMakerFacade {

	/** The htc. */
   	private HTC htc;
	   
   	/** The iphone. */
   	private IPhone iphone;
	   
   	/** The samsung. */
   	private Samsung samsung;
	   
   	/** The phone utility. */
   	private PhoneUtility phoneUtility;
	   
	 /**
   	 * Instantiates a new phone maker.
   	 */
   	public PhoneMakerFacade() {
		   this.htc = new HTC();
		   this.iphone = new IPhone();
		   this.samsung = new Samsung();
		   phoneUtility = new PhoneUtility();
	   }

	   /**
   	 * Make calls htc.
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double makeCallsHTC(int minutes){
		   double cost = htc.makeCalls(minutes);
		   return cost;
	   }
	   
   	/**
   	 * Make calls on iphone .
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double makeCallsIPhone(int minutes){
		   double cost = iphone.makeCalls(minutes);
		   return cost;
	   }
	   
   	/**
   	 * Make calls for samsung phone.
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double makeCallsSamsung(int minutes){
		   double cost = samsung.makeCalls(minutes);
		   return cost;
	   }
	   
	 /**
   	 * Answer calls for htc phone.
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double answerCallsHTC(int minutes){
		   double cost = htc.makeCalls(minutes);
		   return cost;
	   }
	   
   	/**
   	 * Answer calls for iphone.
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double answerCallsIPhone(int minutes){
		   double cost = iphone.makeCalls(minutes);
		   return cost;
	   }
	   
   	/**
   	 * Answer calls for samsung phone.
   	 *
   	 * @param minutes the minutes
   	 * @return the cost of call
   	 */
   	public double answerCallsSamsung(int minutes){
		   double cost = samsung.makeCalls(minutes);
		   return cost;
	   }
	   
	   /**
   	 * Gets the sum cost make all call from phones.
   	 *
   	 * @param minutes the minutes
   	 * @return the sum cost make all call from phones
   	 */
   	public double getSumCostMakeAllCallFromPhones(int minutes)
	   {
		   double htcCost = htc.makeCalls(minutes);
		   double iphoneCost = iphone.makeCalls(minutes);
		   double samsungCost = samsung.makeCalls(minutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   return  finalCost;
	   }
	   
	   /**
   	 * Gets the sum cost answer all call from phones.
   	 *
   	 * @param minutes the minutes
   	 * @return the sum cost answer all call from phones
   	 */
   	public double getSumCostAnswerAllCallFromPhones(int minutes)
	   {
		   
		   double htcCost = htc.answerCalls(minutes);
		   double iphoneCost = iphone.answerCalls(minutes);
		   double samsungCost = samsung.answerCalls(minutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   return  finalCost;
	   }
	   
	   
	   /**
   	 * Gets the sum cost make all call from phones different minutes.
   	 *
   	 * @param htcMinutes the htc minutes
   	 * @param iphoneMinutes the iphone minutes
   	 * @param samsungMinutes the samsung minutes
   	 * @return the sum cost make all call from phones different minutes
   	 */
   	public double getSumCostMakeAllCallFromPhonesDifferentMinutes(int htcMinutes, int iphoneMinutes, int samsungMinutes)
	   {
		   double htcCost = htc.makeCalls(htcMinutes);
		   double iphoneCost = iphone.makeCalls(iphoneMinutes);
		   double samsungCost = samsung.makeCalls(samsungMinutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   return  finalCost;
	   }
	   
	   /**
   	 * Gets the sum cost answer all call from phones different minutes.
   	 *
   	 * @param htcMinutes the htc minutes
   	 * @param iphoneMinutes the iphone minutes
   	 * @param samsungMinutes the samsung minutes
   	 * @return the sum cost answer all call from phones different minutes
   	 */
   	public double getSumCostAnswerAllCallFromPhonesDifferentMinutes(int htcMinutes, int iphoneMinutes, int samsungMinutes)
	   {
		   double htcCost = htc.answerCalls(htcMinutes);
		   double iphoneCost = iphone.answerCalls(iphoneMinutes);
		   double samsungCost = samsung.answerCalls(samsungMinutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   return  finalCost;
	   }
	   
	   /**
   	 * Gets the average cost make all call from phones.
   	 *
   	 * @param minutes the minutes
   	 * @return the average cost make all call from phones
   	 */
   	public double getAverageCostMakeAllCallFromPhones(int minutes)
	   {
		   double htcCost = htc.makeCalls(minutes);
		   double iphoneCost = iphone.makeCalls(minutes);
		   double samsungCost = samsung.makeCalls(minutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   double average = finalCost / 3;
		   
			double roundCost = phoneUtility.getTwoDigitsDoubleValues(average);
		    return roundCost;
	   }
	   
	   /**
   	 * Gets the average cost answer all call from phones.
   	 *
   	 * @param minutes the minutes
   	 * @return the average cost answer all call from phones
   	 */
   	public double getAverageCostAnswerAllCallFromPhones(int minutes)
	   {
		   htc.answerCalls(minutes);
		   iphone.answerCalls(minutes);
		   samsung.answerCalls(minutes);
		   
		   double htcCost = htc.answerCalls(minutes);
		   double iphoneCost = iphone.answerCalls(minutes);
		   double samsungCost = samsung.answerCalls(minutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   double average = finalCost / 3;
		   
			double roundCost = phoneUtility.getTwoDigitsDoubleValues(average);
		    return roundCost;
	   }
	   
	   /**
   	 * Gets the average cost make all call from phones different minutes.
   	 *
   	 * @param htcMinutes the htc minutes
   	 * @param iphoneMinutes the iphone minutes
   	 * @param samsungMinutes the samsung minutes
   	 * @return the average cost make all call from phones different minutes
   	 */
   	public double getAverageCostMakeAllCallFromPhonesDifferentMinutes(int htcMinutes, int iphoneMinutes, int samsungMinutes)
	   {
		   double htcCost = htc.makeCalls(htcMinutes);
		   double iphoneCost = iphone.makeCalls(iphoneMinutes);
		   double samsungCost = samsung.makeCalls(samsungMinutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   
		   double average = finalCost / 3;
		   
			double roundCost = phoneUtility.getTwoDigitsDoubleValues(average);
		    return roundCost;
	   }
	   
	   /**
   	 * Gets the average cost answer all call from phones different minutes.
   	 *
   	 * @param htcMinutes the htc minutes
   	 * @param iphoneMinutes the iphone minutes
   	 * @param samsungMinutes the samsung minutes
   	 * @return the average cost answer all call from phones different minutes
   	 */
   	public double getAverageCostAnswerAllCallFromPhonesDifferentMinutes(int htcMinutes, int iphoneMinutes, int samsungMinutes)
	   {
		   double htcCost = htc.answerCalls(htcMinutes);
		   double iphoneCost = iphone.answerCalls(iphoneMinutes);
		   double samsungCost = samsung.answerCalls(samsungMinutes);
		   double finalCost = htcCost + iphoneCost + samsungCost;
		   double average = finalCost / 3;
		   
			double roundCost = phoneUtility.getTwoDigitsDoubleValues(average);
		    return roundCost;
	   }
	   
	   /**
   	 * Phone all exclusive features check if all on.
   	 *
   	 * @return the boolean for when all phone exclusive features are on.
   	 */
   	public Boolean phoneAllExclusiveFeaturesCheckIfAllOn()
	   {
		   Boolean toggleBacklight = true;
		   Boolean fingerScanOn = true;
		   Boolean accessCodeOn = true;
		   
		   htc.TurnOnBackLight(toggleBacklight);
		   iphone.toggleFingerScan(fingerScanOn);
		   samsung.toggleAccessCodeOn(accessCodeOn);
		   
		   Boolean toggleBacklightHTC = htc.getBacklight();
		   Boolean toggleFingerScanIPHONE = iphone.getFingerscan();
		   Boolean toggletoggleAccessCodeOn = samsung.getAccessCodes();
		   
		   if (toggleBacklightHTC && toggleFingerScanIPHONE && toggletoggleAccessCodeOn)
		   {
			   return true;
		   }
		   return false;
		   
		   
	   }
	   
	 /**
   	 * Phone all exclusive features check if all off.
   	 *
   	 * @return the boolean for when all phone exclusive features are off.
   	 */
   	public Boolean phoneAllExclusiveFeaturesCheckIfAllOff()
	   {
		   Boolean toggleBacklight = false;
		   Boolean fingerScanOn = false;
		   Boolean accessCodeOn = false;
		   
		   htc.TurnOnBackLight(toggleBacklight);
		   iphone.toggleFingerScan(fingerScanOn);
		   samsung.toggleAccessCodeOn(accessCodeOn);
		   
		   Boolean toggleBacklightHTC = htc.getBacklight();
		   Boolean toggleFingerScanIPHONE = iphone.getFingerscan();
		   Boolean toggletoggleAccessCodeOn = samsung.getAccessCodes();
		   
		   if (toggleBacklightHTC && toggleFingerScanIPHONE && toggletoggleAccessCodeOn)
		   {
			   return true;
		   }
		   return false;
	   }
	   
}
