package D29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pops_Alerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
	/*	driver.findElement(By.xpath("//button[@onClick='jsAlert()'] ")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
		driver.switchTo().alert().dismiss(); */
		
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert txt=driver.switchTo().alert();
		txt.sendKeys("abc");
		txt.accept();
	   
	}

}
