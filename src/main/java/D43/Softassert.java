package D43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	
	@Test
	void soft()
	{
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(13, 123);
		System.out.println("passed");
		
		sa.assertAll(); //Mandtory , otherwise test will pass even if validation failed
	}

}
