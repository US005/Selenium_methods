package D45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parralel_Cross {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters ({"browser"})
	void setup(String bs)
	{
		switch(bs.toLowerCase())
		{
			case "chrome" :driver = new ChromeDriver(); break;
			case "edge" :driver = new EdgeDriver(); break;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
	}
	
	@Test (priority=0)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}
	@Test (priority=1)
	void testlogo()
	{
		boolean check=driver.findElement(By.xpath("//img[@alt='Your Store']")).isDisplayed();
		Assert.assertEquals(check, true);
	}
	
	@Test (priority=2)
	void testURL()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.opencart.com/");
	}
	
	@AfterClass
	 void teardown()
	{
		driver.quit();
	}

}
