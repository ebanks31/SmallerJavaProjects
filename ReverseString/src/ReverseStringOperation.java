
/**
 * 
 * This class is used for String Operations and Manipulation. 
 * 
 * @author Eric
 *
 */
public class ReverseStringOperation {

	/**
	 * Default Constructor of the String Operation Class
	 */
	public ReverseStringOperation()
	{
		
	}
	
	/**
	 * The main entry point of the program.
	 * @param args Arguments from the commandline
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word ="Hello";
		
		String result = ReverseString(word);
		
		System.out.println(result);

	}
	
	/**
	 * 
	 * This method reverses a String given a string as a parameter
	 * 
	 * @param words words in parameter that will be reversed.
	 * @return reverse string based on parameter
	 */
	public static String ReverseString(String words)
	{
	    char[] charArray = words.toCharArray();
		String finalresults="";
		
		//Iterate through chracter away backwards starting from the end of the character array.
		for(int i=charArray.length-1;i>=0 ;i--)
		{
			finalresults+=charArray[i];
		}
		return finalresults;
	}
	
	
	}


