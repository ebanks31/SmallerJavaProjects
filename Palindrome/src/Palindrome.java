
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean isPalindrome=isPalinDrome("mom");
		
		if(isPalindrome)
		{
			System.out.println("Is Palindrome");
		}
		else
		{
			System.out.println("Is Not Palindrome");
		}
	}

	
	public static Boolean isPalinDrome(String words)
	{
		String reverseword="";
		Boolean isPalindrome=false;
		
		for(int i=words.length()-1;i>=0;i--)
		{
			char c = words.charAt(i);
			reverseword+=c;
		}
		
		if(reverseword.equals(words))
		{
			isPalindrome=true;
			return isPalindrome;
		}
		else
		{
			return isPalindrome;
		}
		
	}
}
