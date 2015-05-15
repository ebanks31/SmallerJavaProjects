
/**
 * The Class Toyota. This class is the Toyota class and inherits the Car classes attributes
 */
public class Toyota extends Car {

	private static final double ADDITIONALGALLONS = 200;


	/**
	 * Instantiates a new toyota.
	 *
	 * @param carsize the carsize
	 */
	public Toyota(CarSize carsize) {
		super(carsize);
		super.setCarName("Toyota");
	}

	/* (non-Javadoc)
	 * @see Car#printCarName()
	 */
	@Override
	protected void printCarName() {
		System.out.println("This is a Toyota.");
	}


	/* (non-Javadoc)
	 * @see Car#drive(double, double)
	 */
	@Override
	protected double drive(double miles, double gallons) {
		System.out.println("This is a Drive Method for the Toyota.");
		gallons += ADDITIONALGALLONS;
		double mpg = (double) miles / (double) gallons;
		return mpg;
	}

}
