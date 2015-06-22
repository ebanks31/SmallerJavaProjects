
public class Factorial {

	/**
	 * The main entry point of the program
	 * @param args
	 * @throws LessThanZeroException 
	 */
	public static void main(String[] args) throws LessThanZeroException {
		// TODO Auto-generated method stub
		
		long number = 4;
		System.out.println("Factorial : " + FactorialRecursion(number) );
	}

	
	/**
	 * Factorial recursion. Calculate the factorial given a parameter
	 *
	 * @param number Parameter that will calculate the factorial with.
	 * @return the long Factorial of the given parameter
	 * @throws LessThanZeroException 
	 */
	public static long FactorialRecursion(long number) throws LessThanZeroException
	{
		if (number < 0)
		{
			throw new LessThanZeroException();
		}
		
		//base condition
		
		if (number==0)
		{
			return 1;	
			
		}
		
		
		return number * FactorialRecursion(number-1);
		
		}
		
		/**
		 * Factorial iterative.
		 *
		 * @param number the number
		 * @return the int
		 * @throws LessThanZeroException 
		 */
		public static long FactorialIterative(long number) throws LessThanZeroException
		{
			if (number < 0)
			{
				throw new LessThanZeroException();
			}
			if (number == 0)
			{
				return 1;
			}
			
			long result = 1;
			
			for (int i = 1; i<=number; i++)
			{
			
				result *= i;
			}
			
			return result;
		}
	}

