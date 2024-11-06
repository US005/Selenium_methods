package D33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int row =driver.findElements(By.xpath("//div[@class='table-container']//tr")).size();
		System.out.println(row);
		int col = driver.findElements(By.xpath("//div[@class='table-container']//td")).size();
		System.out.println(col);
		
		
		 for(int r=1; r<=row; r++)
	      {
	    	 for(int c=1; c<=col; c++)
	    		 {
	    		   String value= driver.findElement(By.xpath("//div[@class='table-container']//tr["+r+"]//td["+c+"]")).getText();
	    		    System.out.print(value+ " \t");
	    		 }
	    	 System.out.println();
	    	 
	    	 
	/*	List<WebElement> clk=driver.findElements(By.xpath("//a[@href='#']"));	
		
		for(WebElement Clkable:clk)
		{
			Clkable.click();
		}  */
	}
	}
}
