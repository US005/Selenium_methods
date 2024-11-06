package D29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutSwitchTo {
	public static void main(String[] args) {
		
	
	ChromeDriver driver = new ChromeDriver();
	WebDriverWait waits= new WebDriverWait(driver, Duration.ofSeconds(4));
	driver.get("http://the-internet.herokuapp.com/javascript_alerts ");
     
	driver.findElement(By.xpath("//button[@onClick='jsAlert()'] ")).click();
	Alert alerts= waits.until(ExpectedConditions.alertIsPresent());
	alerts.accept();
	}
}