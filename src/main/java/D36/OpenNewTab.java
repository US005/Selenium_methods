package D36;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTab {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		WebElement lis=driver.findElement(By.xpath("//a[@class='ico-register']"));
        Actions act= new Actions(driver);
        
        act.keyDown(Keys.CONTROL).click(lis).keyUp(Keys.CONTROL).build().perform();
        
         List<String> ids= new ArrayList(driver.getWindowHandles());
         driver.switchTo().window(ids.get(1));
         driver.switchTo().window(ids.get(0));
         
         driver.switchTo().newWindow(WindowType.TAB);  //It Will open in NEW TAB
         
	}

}
