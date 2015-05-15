import static org.junit.Assert.*;
import org.junit.Test;


public class BuickTest {
	

	@Test
	public void testBuickGetCarName() throws Exception {
		Buick buick = new Buick(CarSize.MEDIUM);
		String carName = buick.getCarName();
		assertEquals(carName, "Buick");
	}
	
	@Test
	public void testBuickSetCarName() throws Exception {
		Honda honda = new Honda(CarSize.MEDIUM);
		honda.setCarName("TestCar");
		assertEquals(honda.getCarName(), "TestCar");
	}
	
	@Test
	public void testBuickPrintCarName() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		String carName = buick.getCarName();
		buick.printCarName();
		assertEquals(carName, "Buick");
	}
	
	@Test
	public void testBuickDriveValid() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = 30; //Gallons + 100 for Buick. 3000 / 130 = 23
		double mpg = buick.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 23, 0);
	}

	@Test
	public void testBuickDriveSecondValid() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		double miles = 600;
		double gallons = 30; //Gallons + 100 for Buick. 600 / 130 = 4
		double mpg = buick.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		
		assertEquals(roundedNumber, 5, 0);
	}
	
	@Test
	public void testBuickDriveThirdValidSmallerNumberDivideByBiggerNumber() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		double miles = 30;
		double gallons = 30000; //Gallons + 100 for Buick. 30 / 30000 = 0
		double mpg = buick.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 0, 0);
	}
	
	@Test
	public void testBuickDriveDivideByZero() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		double miles = 3000;
		double gallons = -100; //Gallons + 100 for Buick. 3000 / 0 = ArithmeticException
		double mpg = buick.drive(miles, gallons);
		assertEquals(mpg, Double.POSITIVE_INFINITY, 0);
	}
	
	
	@Test
	public void testBuickDriveZeroDivideByNumber() throws Exception {
		
		Buick buick = new Buick(CarSize.MEDIUM);
		double miles = 0;
		double gallons = 800; //Gallons + 100 for Buick. 0 / 900 = 0
		double mpg = buick.drive(miles, gallons);
		assertEquals(mpg, 0, 0);
	}


}
