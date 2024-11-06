package D35;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doublee_click {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='field1'] ")).clear();
		driver.findElement(By.xpath("//input[@id='field1'] ")).sendKeys("ABCDE");
		WebElement clk=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		Actions xyz=new Actions(driver);
		xyz.doubleClick(clk).build().perform();
		xyz.contextClick(); // for RIGHT CLICK
	}

}
