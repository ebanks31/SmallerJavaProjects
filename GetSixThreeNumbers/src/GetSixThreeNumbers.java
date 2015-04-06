
public class GetSixThreeNumbers {

	static String lastword;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String words ="1222333333334455666666777777333333";
		String words ="12223333333344333333";
		
		
		int count = getArray(words,6,"3");
		
		System.out.println("Count: " + count); 
	}
	
	
	public static void setLastWord(String lastword)
	{
		GetSixThreeNumbers.lastword=lastword;
	}
	
	public static String getLastWord()
	{
		return lastword;
	}
	
	public static int getArray(String words,int countoccurences,String key)
	{
		char[] chararray=words.toCharArray();
		int count=0;
		int finalcount=0;
		String firstchar = String.valueOf(chararray[0]);
		setLastWord(firstchar);
		
		
		if(lastword.equals(firstchar))
		{
			count++;
		}
		
			
			
		for(int i=1;i<chararray.length;i++)
		{
			
			String lastnumber = getLastWord();
			String currentnumber = String.valueOf(chararray[i]);

			if(lastnumber.equals(currentnumber) && lastword.equals(key))
			{
				count++;
				setLastWord(String.valueOf(chararray[i]));
				
			}
			else if(lastword.equals(key))
			{
				count++;
			}
			else
			{
				count=0;
				setLastWord(String.valueOf(chararray[i]));
			}
			
			if(count==countoccurences)
			{
				count=0;
				finalcount++;
			
			}
			
			
			
			
		}
		
		return finalcount;
		
	}

}
