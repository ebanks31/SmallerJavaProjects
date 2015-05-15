import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IPhoneTest {

	@Test
	public void testIPhoneTurnOnFingerScan() {
		IPhone iphone = new IPhone();
        Boolean fingerScan = true;
		iphone.toggleFingerScan(fingerScan);
		assertEquals(iphone.getFingerscan(), true);
	}

	@Test
	public void testIPhoneTurnOffFingerScan() {
		IPhone iphone = new IPhone();
        Boolean fingerScan = false;
		iphone.toggleFingerScan(fingerScan);
		assertEquals(iphone.getFingerscan(), false);
	}

	
	@Test
	public void testIPhoneMakeCallsValid(){

		IPhone iphone = new IPhone();
		int minutes = 3;
		double cost = iphone.makeCalls(minutes);
		
		assertEquals(cost, 2.40, 0);
	}
	
	@Test
	public void testIPhoneMakeCallsSecondValid(){

		IPhone iphone = new IPhone();
		int minutes = 90;
		double cost = iphone.makeCalls(minutes);
		
		assertEquals(cost, 72, 0);
	}
	
	@Test
	public void testIPhoneMakeCallsValidZeroMinutes(){

		IPhone iphone = new IPhone();
		int minutes = 0;
		double cost = iphone.makeCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testIPhoneMakeCallsValidOneMinute(){

		IPhone iphone = new IPhone();
		int minutes = 1;
		double cost = iphone.makeCalls(minutes);
		
		assertEquals(cost, 0.8, 0);
	}
	

	@Test
	public void testIPhoneAnswerCallsValid() {
		IPhone iphone = new IPhone();
		int minutes = 3;
		double cost = iphone.answerCalls(minutes);
		
		assertEquals(cost, 2.70, 0);
	}

	@Test
	public void testIPhoneAnswerCallsSecondValid(){

		IPhone iphone = new IPhone();
		int minutes = 70;
		double cost = iphone.answerCalls(minutes);
		
		assertEquals(cost, 63, 0);
	}
	
	
	@Test
	public void testIPhoneAnswerCallsValidZeroMinutes() {
		IPhone iphone = new IPhone();
		int minutes = 0;
		double cost = iphone.answerCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testIPhoneAnswerCallsValidOneMinute() {
		IPhone iphone = new IPhone();
		int minutes = 1;
		double cost = iphone.answerCalls(minutes);
		
		assertEquals(cost, .9, 0);
	}
	
	// Non Valid 
	
	@Test (expected = NullPointerException.class)
	public void testIPhoneMakeCallsNotValidOneNullPointer() {
		IPhone iphone = new IPhone();
		int minutes = (Integer) null;
		double cost = iphone.makeCalls(minutes);

	}
	
	@Test (expected = NullPointerException.class)
	public void testIPhoneAnswerCallsNotValidOneNullPointer() {
		IPhone iphone = new IPhone();
		int minutes = (Integer) null;
		double cost = iphone.answerCalls(minutes);

	}

}
