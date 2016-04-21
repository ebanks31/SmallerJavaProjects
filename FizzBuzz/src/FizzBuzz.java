public class FizzBuzz {


	private int test;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printFizzBuzz(50);
	}

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}

	public FizzBuzz() {
		super();
	}

	public FizzBuzz(int test) {
		super();
		this.test = test;
	}

	
	/**
	 * For numbers starting from 1 to the number in the parameter, 
	 * This method will print Fizz, Buzz, or FizzBuzz depending on the conditions below. 
	 * This method will print FizzBuzz if the number is divisible by 3 and 5.
	 * Print Fizz if divisible by 3.
	 * Print Buzz if divisible by 5.
	 *
	 * @param number the number used to print Fizz, Buzz, or FizzBuzz.
	 */
	public static void printFizzBuzz(int number) {
		for (int i = 1; i < number; i++) {
			System.out.println("Number: " + i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				// Added missing else on statement above.
				// This else check will ensure that each if/else condition is only checked against once.
				System.out.println("Fizz"); 
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else {
				//System.out.println(i);
			}
		}

	}

}
