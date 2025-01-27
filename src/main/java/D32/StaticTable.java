package D32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
    	//Capturing row & column SIZE         //table[@name='BookTable'] //tr
/*	 int row= (driver.findElements(By.xpath("//table[@name='BookTable']//tr ")).size());
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
      } */
     
		
		List<WebElement> rows=driver.findElements(By.xpath(" //table[@class='table table-striped'] //tr"));
		System.out.println(rows.size());
		
		for(int i=1; i<rows.size(); i++)
		{
			WebElement R=driver.findElement(By.xpath("//table[@class='table table-striped'] //tbody //tr["+i+"]//td[1]"));
			if(R.getText().equals("chrome"))
					{
				       System.out.println("captured");
					}
		}
	}

}
