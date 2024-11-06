package D34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatesHandle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(" //input[@id='datepicker'] ")).click();
		
		String yr="2018";
		String mon="July";
		String Date="15";
		 
		while(true)
		{
			String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
		    if(month.equals(mon) && year.equals(yr))
		    {
		    	break;
		    }
			
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		List<WebElement> ddates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'] //tbody  //tr//td //a"));
		
		for(WebElement NumDates:ddates)
		{
			if(NumDates.getText().equals(Date))
			{		
			  NumDates.click();
			}
		}
	}

}
