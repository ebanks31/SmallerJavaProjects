
/**
 * The Class Honda. This class is the Honda class and inherits the Car classes attributes
 */
public class Honda extends Car{

	/**
	 * Instantiates a new honda. Inherits constructor from Car Class
	 *
	 * @param carsize the carsize
	 */
	public Honda(CarSize carsize) {
		super(carsize);
		super.setCarName("Honda");
	}

	/* (non-Javadoc)
	 * @see Car#drive(double, double)
	 */
	@Override
	public double drive(double miles, double gallons) {
		// return Miles Per Gallon
		System.out.println("This is a Drive Method for the Honda.");
		// gallons+=0;
		double mpg = miles / gallons;
		return mpg;
	}



	/* (non-Javadoc)
	 * @see Car#printCarName()
	 */
	@Override
	protected void printCarName() {
		System.out.println("This is a Honda.");
	}


}
