
public class ReverseWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String words ="I went to the store";
		
		String finalresult =reverseStringinStringArray(words);
		
		System.out.println(finalresult);
	}

	
	public static String reverseString(String words)
	{
		String result ="";
		char [] wordsarray = words.toCharArray();
		
		
		for(int i=words.length()-1;i>=0;i--)
		{
			result+=wordsarray[i];
			//String stringValueOf = String.valueOf(wordsarray[i]);
		}
		
		return result;
		
	}
	
	public static String reverseStringinStringArray(String words)
	{
		String result="";
		String[] wordlist = words.split(" ");
		for(int i=0;i<wordlist.length;i++)
		{
			result += reverseString(wordlist[i] + " ");
			
			
		}
		
		return result;
		
	}
	
}
