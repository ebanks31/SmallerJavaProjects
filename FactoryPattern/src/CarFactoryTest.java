import static org.junit.Assert.*;

import org.junit.Test;


public class CarFactoryTest {

	@Test
	public void testGetCarHonda() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.SMALL));
		
		Car car = CarFactory.getCar(CarSize.SMALL);
		
		car.printCarName();
		assertEquals(car.getCarName(),"Honda");
	}
	
	
	@Test
	public void testGetCarBuick() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.MEDIUM));
		
		Car car = CarFactory.getCar(CarSize.MEDIUM);
		
		car.printCarName();
		assertEquals(car.getCarName(),"Buick");
	}
	
	
	@Test
	public void testGetCarToyota() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.LARGE));
		
		Car car = CarFactory.getCar(CarSize.LARGE);
		
		car.printCarName();
		assertEquals(car.getCarName(),"Toyota");
	}

	@Test
	public void testGetCarTwoDifferentCarsAreNotEqual() throws Exception {
		
		
		Car honda = CarFactory.getCar(CarSize.SMALL);
		Car buick = CarFactory.getCar(CarSize.MEDIUM);
		
		honda.printCarName();
		buick.printCarName();
		String hondaCar = honda.getCarName();
		String buickCar = buick.getCarName();
		
		assertFalse(hondaCar.equals(buickCar));
	}
	
	@Test
	public void testGetCarTwoSameCarsAreEqual() throws Exception {
		
		
		Car honda = CarFactory.getCar(CarSize.MEDIUM);
		Car secondHonda = CarFactory.getCar(CarSize.MEDIUM);
		
		honda.printCarName();
		secondHonda.printCarName();
		String hondaCar = honda.getCarName();
		String secondHondaCar = secondHonda.getCarName();
		
		assertTrue(hondaCar.equals(secondHondaCar));
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetCarNull() throws Exception {
		
		Car car = CarFactory.getCar(null);
		
		car.printCarName();
	}
	
	@Test
	public void testGetCarHondaWithDriveMethod() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.SMALL));
		
		Car car = CarFactory.getCar(CarSize.SMALL);
		
		car.printCarName();
		double miles = 1000;
		double gallons = 100; // Gallons + 0 for Honda. Miles Divided by Gallons. 1000 / 100 = 10
		double mpg = car.drive(miles, gallons);
		assertEquals(mpg, 10, 0);
	}
	
	@Test
	public void testGetCarBuickWithDriveMethod() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.MEDIUM));
		
		Car car = CarFactory.getCar(CarSize.MEDIUM);
		
		car.printCarName();
		double miles = 1000;
		double gallons = 100; // Gallons + 100 for Buick. 1000 / 200 = 5
		double mpg = car.drive(miles, gallons);
		assertEquals(mpg, 5, 0);
	}
	
	
	@Test
	public void testGetCarToyotaWithDriveMethod() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.LARGE));
		
		Car car = CarFactory.getCar(CarSize.LARGE);
		
		car.printCarName();
		double miles = 1000;
		double gallons = 100; // Gallons + 200 for Toyota. 1000 / 300 = 3
		double mpg = car.drive(miles, gallons);
		double roundedNumber = Math.round(mpg);
		assertEquals(roundedNumber, 3, 0);
	}
	
	
	@Test
	public void testGetCarToyotaWithDriveMethodDivideByZero() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.LARGE));
		
		Car car = CarFactory.getCar(CarSize.LARGE);
		
		car.printCarName();
		double miles = 1000;
		double gallons = -200; // Gallons + 200 for Toyota. 1000 / 400
		double mpg = car.drive(miles, gallons);
		assertEquals(mpg, Double.POSITIVE_INFINITY, 0);
	}
	
	@Test
	public void testGetCarToyotaWithDriveMethodZeroDivideByNumber() throws Exception {
		
		System.out.println(CarFactory.getCar(CarSize.LARGE));
		
		Car car = CarFactory.getCar(CarSize.LARGE);
		
		car.printCarName();
		double miles = 0;
		double gallons = 100; 
		double mpg = car.drive(miles, gallons);
		assertEquals(mpg, 0, 0);
	}
	
}
