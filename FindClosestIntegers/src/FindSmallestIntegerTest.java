import static org.junit.Assert.*;

import org.junit.Test;


public class FindSmallestIntegerTest {

	@Test
	public void testFindSmallestIntegerDifference() throws Exception {
		int[] firstintarray = {1,20,45,299};
		int[] secondintarray = {5,15,45,276};
		//4,14,44,275
		
		FindSmallestInteger.findSmallestIntegerDifference(firstintarray,secondintarray);
		
	}

}
