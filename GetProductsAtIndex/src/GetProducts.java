
public class GetProducts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] firstarray = {3, 1, 2, 5, 6, 4};
		int [] finalarray=getBeforeProducts(firstarray);
		
		int [] finalarray2=getAfterProducts(firstarray);
		int [] finalarray3=getProducts(finalarray,finalarray2);
	}
	
	
	
	public static int[] getAfterProducts(int [] firstarray)
	{
		
		int [] finalarray = new int[firstarray.length];
		int valueSoFar=1;
		for(int i=firstarray.length-1;i>=0;i--)
		{

			finalarray[i]=valueSoFar;
			valueSoFar*=firstarray[i];
			System.out.println("First Array After : "+ finalarray[i]);
		}
		
		
		return finalarray;
		
	}
	
	
	public static int[] getBeforeProducts(int [] firstarray)
	{
		
		int [] finalarray = new int[firstarray.length];
		int valueSoFar=1;
		
		
		for(int i=0;i<firstarray.length;i++)
		{
			finalarray[i]=valueSoFar;
			valueSoFar*=firstarray[i];
			System.out.println("First Array : "+ finalarray[i]);
		}

		return finalarray;
		
	}
	
	
	public static int[] getProducts(int [] firstarray,int [] secondarray)
	{
		
		int [] finalarray = new int[firstarray.length];
		
		
		for(int i=0;i<firstarray.length;i++)
		{
			finalarray[i]=firstarray[i]*secondarray[i];
			//int currentproduct = firstarray[i];
			//currentproduct*=firstarray[i];
			System.out.println("First Array Final : "+ finalarray[i]);
		}
		
		
		
		return finalarray;
		
	}
	
	
	
	
}
