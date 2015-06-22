
/**
 * The Class BinarySearch.
 */
public class BinarySearch {

	    /**
    	 * Binary search method given a specific key
    	 *
    	 * @param numberarray the numberarray for binary search
    	 * @param key the key to search for in integer array
    	 * @return true, if successful
    	 */
    	public static boolean binarySearch(int [] numberarray, int key) 
	    {
	        int low = 0;
	        int high = numberarray.length - 1;
	         
	        while(high >= low) {
             int middle = (low + high) / 2;
	             if(numberarray[middle] == key) {
	                 return true;
	             }
	             if(key > numberarray[middle]) {
	                low = middle + 1;
	             }
	             if(key < numberarray[middle]) {
	                 high = middle - 1;
	             }
	        }
	        return false;
	   }
	    
	    
	    /**
    	 * The main method.
    	 *
    	 * @param args the arguments
    	 */
    	public static void main(String [] args)
	    {
	    	int [] numberArray = {2,3,4,5,6,7,8,9,10};
	    	Boolean value = binarySearch(numberArray, 1);
	    	System.out.println(value.toString());
	    }
	    
}
