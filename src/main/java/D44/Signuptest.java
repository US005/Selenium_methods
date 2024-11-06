package D44;

import org.testng.annotations.Test;

public class Signuptest {
	
	@Test (priority=1, groups= {"Regression"})
	void signBYemail()
	{
		System.out.println("signed by email");
	}
	
	@Test (priority=2, groups= {"Regression"})
	void signBYusername()
	{
		System.out.println("signed by username");
	}
	
	@Test (priority=3, groups= {"Regression"})
	void signBYtwitter()
	{
		System.out.println("signed by twitter");
	}


}
