package D28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://testautomationpractice.blogspot.com/");
   driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
    Set<String> page= driver.getWindowHandles();
    
    System.out.println(page.size());
    for(String ids:page)
    {
    	String pages=driver.switchTo().window(ids).getTitle();
    	if(pages.equals("Automation Testing Practice"))
    	{
    		System.out.println(driver.getCurrentUrl());
			driver.close();
		
    	}
    }
    
}
}
