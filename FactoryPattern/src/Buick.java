
/**
 * The Class Buick. This class is the Buick class and inherits the Car classes attributes
 */
public class Buick extends Car {


	private static final double ADDITIONALGALLONS = 100;

	/**
	 * Instantiates a new buick. Inherit constructor from car class. 
	 *
	 * @param carsize the carsize
	 */
	public Buick(CarSize carsize) {
		super(carsize);
		super.setCarName("Buick");
	}


	/* (non-Javadoc)
	 * @see Car#printCarName()
	 */
	@Override
	protected void printCarName() {
		System.out.println("This is a Buick.");
	}

	/* (non-Javadoc)
	 * @see Car#drive(double, double)
	 */
	@Override
	protected double drive(double miles, double gallons) {
		System.out.println("This is a Drive Method for the Buick.");
		gallons += ADDITIONALGALLONS;
		double mpg = miles / gallons;
		return mpg;
	}


}
