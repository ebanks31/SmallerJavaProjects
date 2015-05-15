import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SamsungTest {


	@Test
	public void testSamsungToggleAccessCodeOn() {
		Samsung samsung = new Samsung();
        Boolean accessCodes = true;
		samsung.toggleAccessCodeOn(accessCodes);
		assertEquals(samsung.getAccessCodes(), true);
	}

	@Test
	public void testSamsungToggleAccessCodeOff() {
		Samsung samsung = new Samsung();
        Boolean accessCodes = false;
		samsung.toggleAccessCodeOn(accessCodes);
		assertEquals(samsung.getAccessCodes(), false);
	}
	
	@Test
	public void testSamsungMakeCallsValid(){

		Samsung samsung = new Samsung();
		int minutes = 3;
		double cost = samsung.makeCalls(minutes);
		
		assertEquals(cost, 1.5, 0);
	}
	
	@Test
	public void testSamsungMakeCallsSecondValid(){

		Samsung samsung = new Samsung();
		int minutes = 90;
		double cost = samsung.makeCalls(minutes);
		
		assertEquals(cost, 45.00, 0);
	}
	
	@Test
	public void testSamsungMakeCallsValidZeroMinutes(){

		Samsung samsung = new Samsung();
		int minutes = 0;
		double cost = samsung.makeCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testSamsungMakeCallsValidOneMinute(){

		Samsung samsung = new Samsung();
		int minutes = 1;
		double cost = samsung.makeCalls(minutes);
		
		assertEquals(cost, 0.5, 0);
	}
	

	@Test
	public void testSamsungAnswerCallsValid() {
		Samsung samsung = new Samsung();
		int minutes = 3;
		double cost = samsung.answerCalls(minutes);
		
		assertEquals(cost, 1.20, 0);
	}

	@Test
	public void testSamsungAnswerCallsSecondValid(){

		Samsung samsung = new Samsung();
		int minutes = 70;
		double cost = samsung.answerCalls(minutes);
		
		assertEquals(cost, 28.00, 0);
	}
	
	
	@Test
	public void testSamsungAnswerCallsValidZeroMinutes() {
		Samsung samsung = new Samsung();
		int minutes = 0;
		double cost = samsung.answerCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testSamsungAnswerCallsValidOneMinute() {
		Samsung samsung = new Samsung();
		int minutes = 1;
		double cost = samsung.answerCalls(minutes);
		
		assertEquals(cost, .4, 0);
	}
	
	// Non Valid 
	
	@Test (expected = NullPointerException.class)
	public void testSamsungMakeCallsNotValidOneNullPointer() {
		Samsung samsung = new Samsung();
		int minutes = (Integer) null;
		double cost = samsung.makeCalls(minutes);

	}
	
	@Test (expected = NullPointerException.class)
	public void testSamsungAnswerCallsNotValidOneNullPointer() {
		Samsung samsung = new Samsung();
		int minutes = (Integer) null;
		double cost = samsung.answerCalls(minutes);

	}

}
