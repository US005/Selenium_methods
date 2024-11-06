package D27;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilictly_wiat {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait time= new WebDriverWait(driver, Duration.ofSeconds(4));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		

		
		WebElement Username = time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		Username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
