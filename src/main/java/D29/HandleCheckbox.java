package D29;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checks=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//Selecting all checkboxes
	/*	for(WebElement box:checks)
		{
			box.click();
		} */
		
		//Selecting last 3 checkboxes
	/*	for(int i=3; i<checks.size(); i++)
		{
		      checks.get(i).click();
		} */
		
		//Selecting first 3 checkboxes
		for(int i=0; i<checks.size()-4; i++)
		{
		      checks.get(i).click();
		}
	}

}
