import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ToyotaTest {

	@Test
	public void testToyotaGetCarName() throws Exception {
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		String carName = toyota.getCarName();
		assertEquals(carName, "Toyota");
	}
	
	@Test
	public void testToyotaSetCarName() throws Exception {
		Honda honda = new Honda(CarSize.MEDIUM);
		honda.setCarName("TestCarDifferent");
		assertEquals(honda.getCarName(), "TestCarDifferent");
	}
	
	@Test
	public void testToyotaPrintCarName() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		String carName = toyota.getCarName();
		toyota.printCarName();
		assertEquals(carName, "Toyota");
	}
	
	@Test
	public void testToyotaDriveValid() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = 30; // Gallons + 200 for Toyota. 3000 / 130 = 23
		double mpg = toyota.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 13, 0);
	}

	@Test
	public void testToyotaDriveSecondValid() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		double miles = 600;
		double gallons = 30; //Gallons + 200 for Toyota. 600 / 230 = 4
		double mpg = toyota.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 3, 0);
	}
	
	@Test
	public void testToyotaDriveThirdValidSmallerNumberDivideByBiggerNumber() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		double miles = 30;
		double gallons = 30000; //Gallons + 200 for Toyota. 30 / 30000 = 0
		double mpg = toyota.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 0, 0);
	}
	
	@Test
	public void testToyotaDriveDivideByZero() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = -200; //Gallons + 200 for Toyota. 3000 / 0 = ArithmeticException
		double mpg = toyota.drive(miles, gallons);
		assertEquals(mpg, Double.POSITIVE_INFINITY, 0);
	}
	
	
	@Test
	public void testToyotaDriveZeroDivideByNumber() throws Exception {
		
		Toyota toyota = new Toyota(CarSize.MEDIUM);
		double miles = 0;
		double gallons = 800; //Gallons + 200 for Toyota. 0 / 900 = 0
		double mpg = toyota.drive(miles, gallons);
		assertEquals(mpg, 0, 0);
	}




}
