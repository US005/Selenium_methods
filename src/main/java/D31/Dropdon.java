package D31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement droplist=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drops = new Select(droplist);
	/*	drops.selectByVisibleText("Germany");
		drops.selectByIndex(5);
		drops.deselectByValue("brazil"); */
		
		//getOptions used to count total dropdown 
		List<WebElement> opt=drops.getOptions();
		
	/*	for(int i=0; i<=opt.size(); i++)
		{
			System.out.println(opt.get(i).getText());
		} */
		
		for(WebElement lists:opt) 
		{
			System.out.println(lists.getText());
		}
		
		
	}
}
