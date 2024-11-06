package D35;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHov {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://hmsa.com/");
		WebElement hover=driver.findElement(By.xpath("(//a[@href='/health-plans/']) [1]"));
		WebElement ele =driver.findElement(By.xpath("//a[@href='/health-plans/individuals-families/metallic-plans/']"));
		Actions xyz= new Actions (driver);
		xyz.moveToElement(hover).click(ele).build().perform();
		
	}

}

