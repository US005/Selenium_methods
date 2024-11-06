package D34;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateshandles2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://dummy-tickets.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='source[]']")).sendKeys("kar");
		
		List<WebElement> lists=driver.findElements(By.xpath("//div[@class='suggestion-block']"));
	    
	for(WebElement suggests : lists)
	{
		System.out.println(suggests.getText());
		if(suggests.getText().equals("Karpathos Airport, Karpathos - AOK "))
		{
			suggests.click(); 
		}
	}
}

}
