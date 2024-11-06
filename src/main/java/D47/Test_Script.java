package D47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Script {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
	driver =new ChromeDriver();
	driver.get("https://www.saucedemo.com/ ");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
	
	@Test 
	void testlogin()
	{
		Demo_POM cl=new Demo_POM(driver);
		cl.perform_act("standard_user", "secret_sauce");
		cl.logged();
		
	}
	
	@AfterClass
	void testlogout()
	{
		driver.quit();
	}
	
}