package D32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
    	//Capturing row & column SIZE
	 int row= (driver.findElements(By.xpath("//table[@name='BookTable']//tr ")).size());
	 System.out.println(row);
     int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
     System.out.println(col);
     
     for(int r=2; r<=row; r++)
      {
    	 for(int c=1; c<=col; c++)
    		 {
    		   String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
    		    System.out.print(value+ " \t");
    		 }
    	 System.out.println();
      }
     
	}

}
