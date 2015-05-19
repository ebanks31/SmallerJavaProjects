
public class Fibonacci {

	/**
	 * The main entry point of the program.
	 * 
	 * @param args
	 * @throws LessThanOrEqualToZeroException 
	 */
	public static void main(String[] args) throws LessThanOrEqualToZeroException {

	long number = 100;
	long result = getFibonacciWithRecursion(number);
	
      for (long i = 1; i <= number; i++){
		System.out.println("Fibonacci Series " + getFibonacciSeriesWithoutRecursion(i));
      }
	}
	
	
	/**
	 * Gets the fibonacci number with Recursion
	 *
	 * @param number the number to calculate Fibonacci result.
	 * @return the fibonacci result
	 * @throws LessThanOrEqualToZeroException throws this exception if number is less than or equal to zero.
	 */
	public static long getFibonacciWithRecursion(long number) throws LessThanOrEqualToZeroException
	{
		if (number <=0 )
		{
			throw new LessThanOrEqualToZeroException();
		}
		
	     if (number == 1 || number == 2){
	            return 1;
	        }
		
		return getFibonacciWithRecursion(number - 2) + getFibonacciWithRecursion(number - 1);
		
	}

	
	/**
	 * Gets the fibonacci series without recursion
	 *
	 * @param number the number to calculate Fibonacci series.
	 * @return the fibonacci series
	 * @throws LessThanOrEqualToZeroException throws this exception if number is less than or equal to zero.
	 */
	public static long getFibonacciSeriesWithoutRecursion(long number) throws LessThanOrEqualToZeroException
	{
		if (number <=0 )
		{
			throw new LessThanOrEqualToZeroException();
		}
		
	     if (number == 1 || number == 2){
	            return 1;
	        }
	     
	     long firstnumber = 1;
	     long secondnumber = 1;
	     long result = 0;
	     
	     for (long i = 3; i <= number; i++)
	     {
	    	 result = firstnumber + secondnumber;
	    	 
	    	 
	    	 firstnumber = secondnumber;
	    	 secondnumber = result;	
	    	 
	     System.out.println("First Number " + firstnumber);
	     System.out.println("Second Number " + secondnumber);
	     System.out.println("Fibonacci Result " + result);
	     }
	     
	     return result;
		
		
	}
	
	

}
