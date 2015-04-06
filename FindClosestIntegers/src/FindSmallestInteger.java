
/**
 * This program is for finding the two closest integers among two integers array. 
 * There will not be integers that have the same value in in array one and in array two.
 * 
 * @author Eric
 *
 */
public class FindSmallestInteger { 
	
	static int smallestdifference;
	static int integerfromfirstarray;
	static int integerfromsecondarray;
	

	
	public static void setSmallestDifference(int smallestdifference)
	{
		FindSmallestInteger.smallestdifference=smallestdifference;
		
	}
	
	public static int getSmallestDifference()
	{
		return smallestdifference;
		
	}
	
	public static void setIntegerFromFirstArray(int integerfromfirstarray)
	{
		FindSmallestInteger.integerfromfirstarray=integerfromfirstarray;
		
	}
	
	public static int getIntegerFromFirstArray()
	{
		return integerfromfirstarray;
		
	}
	
	
	public static void setIntegerFromSecondArray(int integerfromsecondarray)
	{
		FindSmallestInteger.integerfromsecondarray=integerfromsecondarray;
		
	}
	
	public static int getIntegerFromSecondarray()
	{
		return integerfromsecondarray;
		
	}
	
	
	
	/**
	 * The main entry point of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] firstintarray = {1,20,45,299};
		int[] secondintarray = {5,15,45,276};
		//4,14,44,275
		
		findSmallestIntegerDifference(firstintarray,secondintarray);
		printOutDifferences();
	}
	
	
	/**
	 * 
	 * Finds the two closest integers among two integers array. 
	 * 
	 * @param firstarray First integer array
	 * @param secondarray Second integer array
	 * @return
	 */
	public static void findSmallestIntegerDifference(int[] firstarray, int[] secondarray)
	{
		
		setSmallestDifference(Integer.MAX_VALUE);
		
		for(int i =0;i<firstarray.length;i++)
		{
			int currentnumberA=firstarray[i];
			int differences=0;
			
			
			for(int j=0;j<secondarray.length;j++)
			{
				int smallestdifference=getSmallestDifference();
				int currentnumberB=secondarray[j];
				
				if(currentnumberA>currentnumberB)
				{
					differences = currentnumberA-currentnumberB;
				}
				else if(currentnumberB>currentnumberA)
				{
					differences = currentnumberB-currentnumberA;
				}
				
				if(differences<smallestdifference)
				{
					//smallestdifference=differences;
					setSmallestDifference(differences);
					setIntegerFromFirstArray(currentnumberA);
					setIntegerFromSecondArray(currentnumberB);
				}
				
				
				
			}
		}
	}
			

			
		
		
		public static void printOutDifferences()
		{
			
			
			System.out.println("First Integer : " + getIntegerFromFirstArray());
			System.out.println("Second Integer : " + getIntegerFromSecondarray());
			System.out.println("Differences from these integers are : " + getSmallestDifference());
			
		}
		
		
		
		
		
	}
	
	
	
	


