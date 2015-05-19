import static org.junit.Assert.*;

import org.junit.Test;


public class FibonacciTest {

	@Test
	public void testGetFibonacciWithRecursionValid() throws Exception {

		long number = 3;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 2);
	}

	
	@Test
	public void testGetFibonacciWithRecursionValidOne() throws Exception {

		long number = 1;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 1);
		
	}

	
	@Test
	public void testGetFibonacciWithRecursionValidTwo() throws Exception {

		long number = 2;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 1);
		
	}

	@Test
	public void testGetFibonacciWithRecursionValidThree() throws Exception {

		long number = 3;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 2);
		
	}
	
	@Test
	public void testGetFibonacciWithRecursionValidLargeNumber() throws Exception {

		long number = 30;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 832040);
		
	}
	

	@Test(expected = LessThanOrEqualToZeroException.class)
	public void testGetFibonacciWithRecursionNotValidZero() throws Exception {

		long number = 0;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	@Test(expected = LessThanOrEqualToZeroException.class)
	public void testGetFibonacciWithRecursionNotValidNegative() throws Exception {

		long number = -5;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetFibonacciWithRecursionNotValidNull() throws Exception {

		long number = (Long) null;
		long result = Fibonacci.getFibonacciWithRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	@Test
	public void testGetFibonacciWithoutRecursionValid() throws Exception {

		long number = 3;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 2);
		
		
	}

	
	@Test
	public void testGetFibonacciWithoutRecursionValidOne() throws Exception {

		long number = 1;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 1);
		
	}

	
	@Test
	public void testGetFibonacciWithoutRecursionValidTwo() throws Exception {

		long number = 2;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 1);
		
	}

	@Test
	public void testGetFibonacciWithoutRecursionValidThree() throws Exception {

		long number = 3;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 2);
		
	}
	
	@Test
	public void testGetFibonacciWithoutRecursionValidLargeNumber() throws Exception {

		long number = 30;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 832040);
		
	}
	

	@Test(expected = LessThanOrEqualToZeroException.class)
	public void testGetFibonacciWithoutRecursionNotValidZero() throws Exception {

		long number = 0;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	@Test(expected = LessThanOrEqualToZeroException.class)
	public void testGetFibonacciWithoutRecursionNotValidNegative() throws Exception {

		long number = -5;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testGetFibonacciWithoutRecursionNotValidNull() throws Exception {

		long number = (Long) null;
		long result = Fibonacci.getFibonacciSeriesWithoutRecursion(number);
		
		assertEquals(result, 1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
