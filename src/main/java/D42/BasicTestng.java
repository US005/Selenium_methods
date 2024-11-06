package D42;

import org.testng.annotations.Test;

public class BasicTestng {

	@Test(priority=1)
	void openbrowser()
	{
		System.out.println("Browser launched");
	}
	
	@Test (priority=3)
	void Login()
	{
		System.out.println("Login page launched");
	}
	
	@Test (priority=2)
	void Logged()
	{
		System.out.println("Home page ");
	}
	
}
