package D43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void HardAssertion() 
	{
		Assert.assertEquals("AC", "ABC"); //End of program, Statement after this line won't exceute
			System.out.println("passed");  //not displayed
			
			
	}

}
