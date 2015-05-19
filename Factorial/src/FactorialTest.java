import static org.junit.Assert.*;

import org.junit.Test;


public class FactorialTest {

	@Test
	public void testFactorialRecursionValid() throws Exception {
		long number = 4;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 24);
		
	}
	
	@Test
	public void testFactorialRecursionValidZero() throws Exception {
		long number = 0;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 1);
		
	}
	
	@Test
	public void testFactorialRecursionValidOne() throws Exception {
		long number = 1;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 1);
		
	}
	
	@Test
	public void testFactorialRecursionValidTwo() throws Exception {
		long number = 2;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 2);
		
	}
	
	@Test
	public void testFactorialRecursionValidTwenty() throws Exception {
		long number = 10;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 3628800);
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testFactorialRecursionNotValidNull() throws Exception {
		long number = (Long) null;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 2);

	}
	
	@Test(expected = LessThanZeroException.class)
	public void testFactorialRecursionNotValidNegativeOneValue() throws Exception {
		long number = -1;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 2);

	}
	
	@Test(expected = LessThanZeroException.class)
	public void testFactorialRecursionNotValidNegativeValue() throws Exception {
		long number = -20;
		long result = Factorial.FactorialRecursion(number);
		System.out.println("Factorial of " + number  +"! is " + Factorial.FactorialRecursion(number));
		assertEquals(result, 2);

	}

}
