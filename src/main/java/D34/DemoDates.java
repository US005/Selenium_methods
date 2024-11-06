package D34;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDates {

	public static void main(String[] args) {ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://testautomationpractice.blogspot.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1050)", "");
	
	driver.switchTo().frame("frame-one796456169");
	driver.findElement(By.xpath("//span[@class='icon_calendar'] ")).click();
	
	List<WebElement> yr=driver.findElements(By.xpath("//select[@class='ui-datepicker-year'] //option"));
	String year="2022";
    String month="April";
	for(WebElement list:yr)
	{
		if(list. getText().equals(year))
		list.click();
	}
	
	WebElement next=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
	WebElement mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month'] " ));
	
	while(true)
	{
	if(mon.getText().equals(month))
	  {
		break;
	  }
	  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	}
  }
}
