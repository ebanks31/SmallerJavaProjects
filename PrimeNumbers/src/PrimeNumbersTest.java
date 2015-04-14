import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


/**
 * The Class PrimeNumbersTest. Test class for checking Prime Numbers.
 */
public class PrimeNumbersTest {

	/**
	 * Test calculate prime numbers.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculatePrimeNumbers() throws Exception {

		int number=100;
		Boolean IsPrime = PrimeNumbers.isPrime(number);
		assertFalse(IsPrime);
		
	}

	/**
	 * Test calculate prime numbers contains67.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculatePrimeNumbersContains67() throws Exception {

	//	int number=100;
	//	ArrayList<Integer> primeNumbersList = PrimeNumbers.calculatePrimeNumbers(number);
	//	assertTrue(primeNumbersList.contains(67));
		
	}
	
	/**
	 * Test calculate prime numbers non prime.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculatePrimeNumbersNonPrime() throws Exception {

		//int number=100;
		//ArrayList<Integer> primeNumbersList = PrimeNumbers.calculatePrimeNumbers(number);
	//	assertFalse(primeNumbersList.contains(10));
		
	}
	
	/**
	 * Test calculate prime numbers zero.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testCalculatePrimeNumbersZero() throws Exception {

		//int number=100;
		//ArrayList<Integer> primeNumbersList = PrimeNumbers.calculatePrimeNumbers(number);
		//assertFalse(primeNumbersList.contains(0));
		
	}
	
	
	/**
	 * Test is prime.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testIsPrime() throws Exception {

		int number=11;
		Boolean IsPrime = PrimeNumbers.isPrime(number);
		assertTrue(IsPrime);
		
	}
	
	
	/**
	 * Test is prime other value.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testIsPrimeOtherValue() throws Exception {

		int number=67;
		Boolean isprime = PrimeNumbers.isPrime(number);
		assertTrue(isprime);
		
	}
	
	/**
	 * Test is prime non prime.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testIsPrimeNonPrime() throws Exception {

		int number=100;
		Boolean IsPrime = PrimeNumbers.isPrime(number);
		assertFalse(IsPrime);
		
		
	}
	
	
	/**
	 * Test is prime zero.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testIsPrimeZero() throws Exception {

	//	int number=0;
	//	Boolean isprime = PrimeNumbers.IsPrime(number);
	//	assertFalse(isprime);
		
	}
}
