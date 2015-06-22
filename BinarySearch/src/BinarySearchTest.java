import static org.junit.Assert.*;

import org.junit.Test;


public class BinarySearchTest {

	@Test
	public void testBinarySearchKeyFound() throws Exception {
    	int [] numberArray = {2,3,4,5,6,7,8,9,10};
    	Boolean value = BinarySearch.binarySearch(numberArray, 4);
    	assertTrue(value);
	}
	
	@Test
	public void testBinarySearchKeyFoundatLastIndex() throws Exception {
    	int [] numberArray = {2,3,4,5,6,7,8,9,10};
    	Boolean value = BinarySearch.binarySearch(numberArray, 10);
    	assertTrue(value);
	}
	
	@Test
	public void testBinarySearchKeyFoundatZeroIndex() throws Exception {
    	int [] numberArray = {2,3,4,5,6,7,8,9,10};
    	Boolean value = BinarySearch.binarySearch(numberArray, 2);
    	assertTrue(value);
	}
	
	@Test
	public void testBinarySearchKeyNotFound() throws Exception {
    	int [] numberArray = {2,3,4,5,6,7,8,9,10};
    	Boolean value = BinarySearch.binarySearch(numberArray, 1);
    	assertFalse(value);
	}
	
	@Test
	public void testBinarySearchKeyFoundOneItem() throws Exception {
    	int [] numberArray = {4};
    	Boolean value = BinarySearch.binarySearch(numberArray, 4);
    	assertTrue(value);
	}
	
	@Test
	public void testBinarySearchKeyNotFoundOneItem() throws Exception {
    	int [] numberArray = {4};
    	Boolean value = BinarySearch.binarySearch(numberArray, 5);
    	assertFalse(value);
	}
	
	@Test
	public void testBinarySearchKeyEmptyList() throws Exception {
    	int [] numberArray = {};
    	Boolean value = BinarySearch.binarySearch(numberArray, 1);
    	assertFalse(value);
	}
	
	@Test(expected = NullPointerException.class)
	public void testBinarySearchListIsNull() throws Exception {
    	int [] numberArray = null;
    	Boolean value = BinarySearch.binarySearch(numberArray, 1);
    	assertFalse(value);
	}
}
