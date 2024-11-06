package D31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosugestiveDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.bjs.com/");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("tables");
		
		List<WebElement> tables=driver.findElements(By.xpath("//div[@class='list list-group']"));
		
		for(WebElement lis:tables)
		{
			System.out.println(lis.getText());
			if(lis.getText().equals("tables outside"))
			lis.click();
		}
	
	}

}
