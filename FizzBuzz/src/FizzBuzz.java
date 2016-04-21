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


	public static void printFizzBuzz(int number) {
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (i % 3 == 0) {
				// Added missing else on statement above.
				// This else check will ensure that each if/else condition is only checked againstance.
				System.out.println("Fizz"); 
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else {
				//System.out.println(i);
			}
		}

	}

}
