import static org.junit.Assert.*;

import org.junit.Test;


public class HTCTest {

	@Test
	public void testHTCTurnOnBackLight() {
		HTC htc = new HTC();
        Boolean backlight = true;
		htc.TurnOnBackLight(backlight);
		assertEquals(htc.getBacklight(), true);
	}

	@Test
	public void testHTCTurnOffBackLight() {
		HTC htc = new HTC();
        Boolean backlight = false;
		htc.TurnOnBackLight(backlight);
		assertEquals(htc.getBacklight(), false);
	}
		
		
	@Test
	public void testHTCMakeCallsValid(){

		HTC htc = new HTC();
		int minutes = 3;
		double cost = htc.makeCalls(minutes);
		
		assertEquals(cost, 2.10, 0);
	}
	
	@Test
	public void testHTCMakeCallsSecondValid(){

		HTC htc = new HTC();
		int minutes = 90;
		double cost = htc.makeCalls(minutes);
		
		assertEquals(cost, 63, 0);
	}
	
	@Test
	public void testHTCMakeCallsValidZeroMinutes(){

		HTC htc = new HTC();
		int minutes = 0;
		double cost = htc.makeCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testHTCMakeCallsValidOneMinute(){

		HTC htc = new HTC();
		int minutes = 1;
		double cost = htc.makeCalls(minutes);
		
		assertEquals(cost, 0.7, 0);
	}
	

	@Test
	public void testHTCAnswerCallsValid() {
		HTC htc = new HTC();
		int minutes = 3;
		double cost = htc.answerCalls(minutes);
		
		assertEquals(cost, 1.80, 0);
	}

	@Test
	public void testHTCAnswerCallsSecondValid(){

		HTC htc = new HTC();
		int minutes = 70;
		double cost = htc.answerCalls(minutes);
		
		assertEquals(cost, 42, 0);
	}
	
	
	@Test
	public void testHTCAnswerCallsValidZeroMinutes() {
		HTC htc = new HTC();
		int minutes = 0;
		double cost = htc.answerCalls(minutes);
		
		assertEquals(cost, 0, 0);
	}
	
	@Test
	public void testHTCAnswerCallsValidOneMinute() {
		HTC htc = new HTC();
		int minutes = 1;
		double cost = htc.answerCalls(minutes);
		
		assertEquals(cost, .6, 0);
	}
	
	// Non Valid 
	
	@Test (expected = NullPointerException.class)
	public void testHTCMakeCallsNotValidOneNullPointer() {
		HTC htc = new HTC();
		int minutes = (Integer) null;
		double cost = htc.makeCalls(minutes);

	}
	
	@Test (expected = NullPointerException.class)
	public void testHTCAnswerCallsNotValidOneNullPointer() {
		HTC htc = new HTC();
		int minutes = (Integer) null;
		double cost = htc.answerCalls(minutes);

	}
}
