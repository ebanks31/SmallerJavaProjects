import java.util.ArrayList;


/**
 * The Class PrimeNumbers. This class checks for prime number up to a value.
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=100;
	//	ArrayList<Integer> calculatePrimeNumbers = calculatePrimeNumbers(number);
	}

	//checks whether an int is prime or not.
	public static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
}
