package D44;

import org.testng.annotations.Test;

public class Paymenttest {
	
	@Test (priority=1, groups= {"sanity", "Regression"})
	void payRupees()
	{
		System.out.println("Rupees");
	}
	
	@Test (priority=2, groups= {"sanity", "Regression"})
	void payDolloars()
	{
		System.out.println("Dollars");
	}
	

}
