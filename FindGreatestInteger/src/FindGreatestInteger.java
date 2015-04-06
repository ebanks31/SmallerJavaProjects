
public class FindGreatestInteger {

	static int greatestinteger;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array ={1,7,3,4,5};
		findGreatestInteger(array);
	}
	
	public static int getGreatestInteger()
	{
		return greatestinteger;
	}
	
	public static void setGreatestInteger(int greatestinteger)
	{
		FindGreatestInteger.greatestinteger=greatestinteger;
		
	}
	
	public static int findGreatestInteger(int[] array)
	{
		
		setGreatestInteger(array[0]);
		
		for(int i=1;i<array.length;i++)
		{
			int greatestinteger=getGreatestInteger();
			int currentinteger = array[i];
			
			if(currentinteger>greatestinteger)
			{
				setGreatestInteger(currentinteger);
			}
			else
			{
				
			}
				
			
		}
		int greatestinteger=getGreatestInteger();
		System.out.println("Greatest Integer : " + greatestinteger);
		return greatestinteger;
		
	}

}
