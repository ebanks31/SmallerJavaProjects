import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HondaTest {

	@Test
	public void testHondaGetCarName() throws Exception {
		Honda honda = new Honda(CarSize.MEDIUM);
		String carName = honda.getCarName();
		assertEquals(carName, "Honda");
	}
	
	@Test
	public void testHondaSetCarName() throws Exception {
		Honda honda = new Honda(CarSize.MEDIUM);
		honda.setCarName("Car");
		assertEquals(honda.getCarName(), "Car");
	}
	
	@Test
	public void testHondaPrintCarName() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		String carName = honda.getCarName();
		honda.printCarName();
		assertEquals(carName, "Honda");
	}
	
	@Test
	public void testHondaDriveValid() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = 30; //Gallons + 100 for Honda. 3000 / 30 = 23
		double mpg = honda.drive(miles, gallons);
		assertEquals(mpg, 100, 0);
	}

	@Test
	public void testHondaDriveSecondValid() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		double miles = 600;
		double gallons = 30; //Gallons + 100 for Honda. 600 / 30 = 20
		double mpg = honda.drive(miles, gallons);
		assertEquals(mpg, 20, 0);
	}
	
	@Test
	public void testHondaDriveThirdValidSmallerNumberDivideByBiggerNumber() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		double miles = 30;
		double gallons = 30000; //Gallons + 100 for Honda. 30 / 30000 = 0
		double mpg = honda.drive(miles, gallons);
		assertEquals(mpg, 0.001, 0);
	}
	
	@Test
	public void testHondaDriveDivideByZero() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = 0; // Gallons for Honda. 3000 / 0 = ArithmeticException
		double mpg = honda.drive(miles, gallons);
		assertEquals(mpg, Double.POSITIVE_INFINITY, 0);
	}
	
	
	@Test
	public void testHondaDriveZeroDivideByNumber() throws Exception {
		
		Honda honda = new Honda(CarSize.MEDIUM);
		double miles = 0;
		double gallons = 800; //Gallons + 100 for Honda. 0 / 900 = 0
		double mpg = honda.drive(miles, gallons);
		assertEquals(mpg, 0, 0);
	}



}
