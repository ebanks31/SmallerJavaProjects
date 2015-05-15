

/**
 * The Class Car. This class is abstract so it cannot be instantiated.
 */
public abstract class Car { 

/** The car size. */
private CarSize carSize;

/** The car name. */
private String carName;	

/**
 * Instantiates a new car.
 *
 * @param carSize the car size
 * @param carName the car name
 */
public Car(CarSize carSize, String carName)
{
	this.carSize = carSize;
	this.carName = carName;
}

/**
 * Instantiates a new car.
 *
 * @param carSize the car size
 */
public Car(CarSize carSize)
{
	this.carSize = carSize;
}

/**
 * Prints the car name.
 */
protected abstract void printCarName();

/**
 * Drive.
 *
 * @param miles the miles of the car
 * @param gallons the gallons that were used for the car
 * @return the double, the  miles per gallon
 */
protected abstract double drive(double miles, double gallons);



/**
 * Gets the car size.
 *
 * @return the car size
 */
public CarSize getCarSize() {
	return carSize;
}

/**
 * Sets the car size.
 *
 * @param carSize the new car size
 */
public void setCarSize(CarSize carSize) {
	this.carSize = carSize;
}


/**
 * Gets the car name.
 *
 * @return the car name
 */
public String getCarName() {
	return carName;
}

/**
 * Sets the car name.
 *
 * @param carName the new car name
 */
public void setCarName(String carName) {
	this.carName = carName;
}





}