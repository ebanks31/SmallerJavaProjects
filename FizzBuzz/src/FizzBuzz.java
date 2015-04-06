public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated constructor stub
	}

	public FizzBuzz(int test) {
		super();
		this.test = test;
	}

	private int test;

	public static void printFizzBuzz(int number) {
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			if (i % 3 == 0) {
				System.out.println("Fizz"); 
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else {
				System.out.println(i);
			}
		}

	}

}
