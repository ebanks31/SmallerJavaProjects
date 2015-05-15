
/**
 * A factory for creating Car objects.
 */
public class CarFactory {

	
	/**
	 * Gets the car. Small Car = Honda, Medium Car = Buick, Large Car = Toyota.
	 *
	 * @param carSize the car size
	 * @return the car based on car size
	 */
	public static Car getCar(CarSize carSize)
	{
		Car car = null;
		
		if (carSize == CarSize.SMALL)
		{
			car = new Honda(carSize);
		//	car.setCarName("Honda");
		}
		else if (carSize == CarSize.MEDIUM)
		{
			car = new Buick(carSize);
		//	car.setCarName("Buick");
		}
		else if (carSize == CarSize.LARGE)
		{
			car = new Toyota(carSize);
		//	car.setCarName("Toyota");
		}

		return car;
		
	}
}
