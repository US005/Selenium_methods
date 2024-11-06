package D44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest {
	
	@Test (priority=1, groups= {"sanity"})
	void loginBYemail()
	{
		System.out.println("logged by email");
	}
	
	@Test (priority=2, groups= {"sanity"})
	void loginBYusername()
	{
		System.out.println("logged by username");
	}
	
	@Test (priority=3, groups= {"sanity"})
	void loginBYtwitter()
	{
		System.out.println("logged by twitter");
	}

}
