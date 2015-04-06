import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class DistinctArrayTest {

	@Test
	public void testGetDistinctValues() throws Exception {
		
		String[] originalarraylist = {"hello","hello","car","water","car","meter","jam","meter","meter","apple"};
		ArrayList<String> distinctvalues = DistinctArray.getDistinctValues(originalarraylist);
		for(int i=0;i<distinctvalues.size();i++)
		{
			System.out.println(distinctvalues.get(i));
		}
		assertTrue(distinctvalues.contains("water"));
	}

}
