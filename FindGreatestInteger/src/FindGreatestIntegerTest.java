import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


public class FindGreatestIntegerTest {

	@Mock
	private int greatestInteger;
	@InjectMocks
	private FindGreatestInteger findGreatestInteger;


	@Test
	public void greatestIntValidTest() {
		int[] array = { 1, 7, 3, 4, 5 };
		int number = FindGreatestInteger.findGreatestInteger(array);
		assertEquals(7, number);
	}


	@Test
	public void testFindGreatestInteger() throws Exception {
		int[] array = { 1, 7, 3, 4, 5 };
		int number = FindGreatestInteger.findGreatestInteger(array);
		assertEquals(7, number);
	}


}
