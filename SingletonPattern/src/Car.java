
/**
 * 
 * Car class with a Singleton Design Pattern. 
 * 
 * @author Eric
 *
 */
public class Car {

	
	private static Car carInstance = new Car();
	

	/**
	 *  Constuctor is private to ensure an instance CANNOT be created;
	 */
	private Car()
	{
		
	}
	
	/**
	 * Gets the car instance. This method is the only way to obtain an instance of the Car Class.
	 *
	 * @return the car instance
	 */
	public static Car getCarInstance()
	{
		return carInstance;
	}
	
	/**
	 * Gets the miles per gallon given miles and gallon used for a car.
	 *
	 * @param miles the miles drive bt car
	 * @param gallon the gallon used by the car
	 * @return miles per gallon
	 */
	public float drive(int miles, int gallon)
	{
		float mpg = miles/gallon;
		return mpg;
	}
	

}
