
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long result=prlongFibonacci(100);
		
		//System.out.prlongln("Fibonacci " + prlongFibonacci(4));
		long number=100;
        for(long i=1; i<=number; i++){
		System.out.println("Fibonacci Series " + printFibonacciSeries(i));
        }
	}
	
	
	public static long printFibonacci(long number)
	{
	     if(number == 1 || number == 2){
	            return 1;
	        }
		
		return printFibonacci(number - 1) + printFibonacci(number - 2);
		
	}

	
	public static long printFibonacciSeries(long number)
	{
		
	     if(number == 1 || number == 2){
	            return 1;
	        }
	     
	     long firstnumber=1;
	     long secondnumber=1;
	     long result=0;
	     
	     for(long i=3;i<=number;i++)
	     {
	    	 result=firstnumber+secondnumber;
	    	 //firstnumber+=
	    	 
	    	 
	    	 firstnumber=secondnumber;
	    	 secondnumber=result;	
	    	 
	    	// System.out.prlongln("Fibonacci " + result);
	     }
	     
	     return result;
		
		
	}
	
	

}
