import static org.junit.Assert.*;

import org.junit.Test;


public class PhoneUtilityTest {

	@Test
	public void testGetTwoDigitsDoubleValuesValidRoundUp() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 45.12666;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 45.13, 0);
	}
	
	
	@Test
	public void testGetTwoDigitsDoubleValuesRoundDown() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 45.12336;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 45.12, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesZeroCost() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 0;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 0, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesOneCost() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 1;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 1, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesValidRoundUpOneLeftDigit() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 5.12666;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 5.13, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesValidRoundDownOneLeftDigit() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = 5.12166;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, 5.12, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesValidRoundUpNoLeftDigit() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = .12666;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, .13, 0);
	}
	
	@Test
	public void testGetTwoDigitsDoubleValuesValidRoundDownNoLeftDigit() throws Exception {
		PhoneUtility phoneUtility = new PhoneUtility();
		double cost = .52666;
		double roundCost = phoneUtility.getTwoDigitsDoubleValues(cost);
		assertEquals(roundCost, .53, 0);
	}

}
