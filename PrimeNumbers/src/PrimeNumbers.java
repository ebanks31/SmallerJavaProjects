import java.util.ArrayList;


/**
 * The Class PrimeNumbers. This class checks for prime number up to a value.
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=100;
		ArrayList<Integer> calculatePrimeNumbers = calculatePrimeNumbers(number);
	}

	/**
	 * Calculate the prime numbers up to a value in the parameter
	 *
	 * @param number the number
	 * @return the array list of prime numbers
	 */
	public static ArrayList<Integer> calculatePrimeNumbers(int number)
	{
		ArrayList<Integer> primenumberlist = new ArrayList<Integer>();
		for(int i=1;i<number+1;i++)
		{
			
			if(IsPrime(i))
			{
				
				primenumberlist.add(i);
				System.out.println("Prime Number: " +i );
				
			}
		}
		
		return primenumberlist;
	}

	/**
	 * Checks if is prime number.
	 *
	 * @param number the number
	 * @return true, if number is prime, false if number is not prime.
	 */
	public static boolean IsPrime(int number) {

		if(number%2==0 || number%3==0||number%5==0||number%7==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
}
