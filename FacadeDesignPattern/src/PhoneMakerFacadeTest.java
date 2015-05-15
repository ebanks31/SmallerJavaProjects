import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneMakerFacadeTest {

	@Test
	public void testMakeCallsHTC() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 25;
		double cost = phonemaker.makeCallsHTC(minutes);
		assertEquals(cost, 17.50, 0);
	}
	
	@Test(expected = NullPointerException.class)
	public void testMakeCallsHTCNotValid() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = (Integer) null;
		double cost = phonemaker.makeCallsHTC(minutes);
		assertEquals(cost, 17.50, 0);
	}
	
	@Test
	public void testMakeCallsIPhone() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		
		int minutes = 30;
		double cost = phonemaker.makeCallsIPhone(minutes);
		assertEquals(cost, 24.00, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testMakeCallsIPhoneNotValid() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		
		int minutes = (Integer) null;
		double cost = phonemaker.makeCallsIPhone(minutes);
		assertEquals(cost, 24.00, 0);
	}
	
	@Test
	public void testMakeCallsSamsung(){
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 40;
		double cost = phonemaker.makeCallsSamsung(minutes );
		assertEquals(cost, 20.00, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testMakeCallsSamsungNotValid(){
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = (Integer) null;
		double cost = phonemaker.makeCallsSamsung(minutes );
		assertEquals(cost, 20.00, 0);
	}
	
	@Test
	public void testAnswerCallsHTC() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 45;
		double cost = phonemaker.answerCallsHTC(minutes);
		assertEquals(cost, 31.50, 0);
	}

	@Test
	public void testAnswerCallsIPhone() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 50;
		double cost = phonemaker.answerCallsIPhone(minutes);
		assertEquals(cost, 40.00, 0);
	}

	@Test
	public void testAnswerCallsSamsung() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 60;
		double cost = phonemaker.answerCallsSamsung(minutes);
		assertEquals(cost, 30.00, 0);
	}

	@Test
	public void testGetSumCostMakeAllCallFromPhonesSameMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 20;
		double cost = phonemaker.getSumCostMakeAllCallFromPhones(minutes);
		assertEquals(cost, 40.00, 0);
	}

	@Test
	public void testGetSumCostAnswerAllCallFromPhonesSameMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 30;
		double cost = phonemaker.getSumCostAnswerAllCallFromPhones(minutes);
		assertEquals(cost, 57, 0);
	}

	@Test
	public void testGetSumCostMakeAllCallFromPhonesDifferentMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		
		int htcMinutes = 20;
		int iphoneMinutes = 30;
		int samsungMinutes = 40;
		double cost = phonemaker.getSumCostMakeAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 58.00, 0);
	}

	@Test
	public void testGetSumCostAnswerAllCallFromPhonesDifferentMinutes() 
	{
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		
		int htcMinutes = 50;
		int iphoneMinutes = 60;
		int samsungMinutes = 70;
		double cost = phonemaker.getSumCostAnswerAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 112.00, 0);
	}

	@Test
	public void testGetAverageCostMakeAllCallFromPhones() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 30;
		double cost = phonemaker.getAverageCostMakeAllCallFromPhones(minutes);
		assertEquals(cost, 20.00, 0);
	}

	@Test
	public void testGetAverageCostAnswerAllCallFromPhones() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 30;
		double cost = phonemaker.getAverageCostAnswerAllCallFromPhones(minutes);
		assertEquals(cost, 19.0, 0);
	}

	@Test
	public void testGetAverageCostAnswerAllCallFromPhonesZeroMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		int minutes = 0;
		double cost = phonemaker.getAverageCostAnswerAllCallFromPhones(minutes);
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testGetAverageCostMakeAllCallFromPhonesDifferentMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();

		int htcMinutes = 20;
		int iphoneMinutes = 30;
		int samsungMinutes = 40;
		
		double cost = phonemaker.getAverageCostMakeAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 19.33, 0);
	}
	
	@Test
	public void testGetAverageCostMakeAllCallFromPhonesDifferentMinutesZero() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();

		int htcMinutes = 0;
		int iphoneMinutes = 0;
		int samsungMinutes = 0;
		
		double cost = phonemaker.getAverageCostMakeAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 0, 0);
	}

	@Test
	public void testGetAverageCostAnswerAllCallFromPhonesDifferentMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();

		int htcMinutes = 70;
		int iphoneMinutes = 90;
		int samsungMinutes = 90;
		
		double cost = phonemaker.getAverageCostAnswerAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 53.00, 0);
	}

	@Test
	public void testGetAverageCostAnswerAllCallFromPhonesDifferentMinutesZeroMinutes() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();

		int htcMinutes = 0;
		int iphoneMinutes = 0;
		int samsungMinutes = 0;
		
		double cost = phonemaker.getAverageCostAnswerAllCallFromPhonesDifferentMinutes(htcMinutes, iphoneMinutes, samsungMinutes);
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testPhoneAllExclusiveFeaturesCheckIfAllOn() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		Boolean featuresOn = phonemaker.phoneAllExclusiveFeaturesCheckIfAllOn();
		assertTrue(featuresOn);
	}

	@Test
	public void testPhoneAllExclusiveFeaturesCheckIfAllOff() {
		PhoneMakerFacade phonemaker = new PhoneMakerFacade();
		Boolean featuresOff = phonemaker.phoneAllExclusiveFeaturesCheckIfAllOff();
		assertFalse(featuresOff);
	}

}
