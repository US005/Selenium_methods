package D28;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_bf {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		driver.getTitle();
		}

}
