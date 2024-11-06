package D42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeTest {
	WebDriver driver;
	
  @Test (priority=1)
  public void initialixe()
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
  }
  
  @Test (priority=2)
  public void logo()
  {
	 boolean logoo= driver.findElement(By.xpath(" //img[@alt='company-branding']")).isDisplayed();
  }
  
  @Test (priority=3)
  public void login()
  {
	  driver.findElement(By.xpath(" //input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.xpath(" //input[@name='password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit'] ")).click();
  }
  
  @Test  (priority=4)
  public void logout()
  {
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name'] ")).click();
	  driver.findElement(By.xpath("(//a[@role='menuitem']) [4] ")).click();
  }
}
