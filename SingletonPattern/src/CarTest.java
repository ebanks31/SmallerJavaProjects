import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Test class for Singleton Design Car Class
 */
public class CarTest {


	/**
	 * Test get car instance valid with two equal instances.
	 *
	 */
	@Test
	public void testGetCarInstanceValidWithTwoEqualInstances() {
		Car car = Car.getCarInstance();
		Car car2 = Car.getCarInstance();

		assertEquals(true, car == car2);
		
	}
	
	/**
	 * Test get car instance valid with drive method.
	 *
	 */
	@Test
	public void testGetCarInstanceValidWithDriveMethod(){
		Car car = Car.getCarInstance();
		
		int miles = 1000;
		int gallons = 10;
		float milesPerGallon = car.drive(miles, gallons); 
		assertEquals(100,milesPerGallon,0);
		
	}
	
	/**
	 * Test get car instance valid with drive method with two equal instances.
	 *
	 */
	@Test
	public void testGetCarInstanceValidWithDriveMethodWithTwoEqualInstances() {
		Car car = Car.getCarInstance();
		Car car2 = Car.getCarInstance();
		
		int miles = 1000;
		int gallons = 10;
		float milesPerGallon = car.drive(miles, gallons); 
		float milesPerGallon2 = car2.drive(miles, gallons); 
		assertEquals(milesPerGallon,milesPerGallon2,0);
		
	}
	
	
	/**
	 * Test get car instance valid with drive method divide by zero.
	 *
	 */
	@Test(expected = ArithmeticException.class)
	public void testGetCarInstanceValidWithDriveMethodDivideByZero() {
		Car car = Car.getCarInstance();
		
		int miles = 1000;
		int gallons = 0;
		float milesPerGallon = car.drive(miles, gallons); 
		
	}
	
	/**
	 * Test get car instance valid with drive method zero divide by number.
	 *
	 */
	@Test
	public void testGetCarInstanceValidWithDriveMethodZeroDivideByNumber() {
		Car car = Car.getCarInstance();
		
		int miles = 0;
		int gallons = 1000;
		float milesPerGallon = car.drive(miles, gallons); 
		assertEquals(milesPerGallon, 0, 0);
	}
	
	/* DOES NOT COMPILE. 
	@Test
	public void testGetCarInstanceNotValid() throws Exception {
		//Car car = new Car(); Not valid. Cannot compile since you CANNOT create an instance of car.
		
		
		int miles = 1000;
		int gallons = 10;
		float milesPerGallon = car.drive(miles, gallons); 
		assertEquals(100, milesPerGallon, 0);
		
	}*/

}
