
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =3;
		System.out.println("Factorial : " + FactorialRecursion(4) );
	}

	
	public static int FactorialRecursion(int number)
	{
		//base condition
		
		if (number==0)
		{
		return 0;	
			
		}
		
		if (number==1)
		{
		return 1;	
			
		}
		
		
		return number * FactorialRecursion(number-1);
		
		}
		
		
	}

