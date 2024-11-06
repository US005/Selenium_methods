package D28;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleswindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		List<WebElement> links=driver.findElements(By.partialLinkText("Selenium"));
		System.out.println(links.size());
		for(WebElement hl:links) 
		{
			hl.click();
		}
//=====================================================================================================
	Set<String> pageids=driver.getWindowHandles();
		System.out.println(pageids);
		
		for(String par:pageids)
		{
			String page=driver.switchTo().window(par).getTitle();
			if(page.equals("Selenium - Wikipedia"))
			{
				System.out.println(driver.getCurrentUrl());
				
			} 
		}
		
	}

}
