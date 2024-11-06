package D44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_methods {
	
	@Test (priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority=2, dependsOnMethods={"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority=3, dependsOnMethods={"login", "openapp"})
	void search()
	{
		Assert.assertTrue(true);
	}

	@Test (priority=4, dependsOnMethods={"search"})
	void Advan_search()
	{
		Assert.assertTrue(true);
	}

}
