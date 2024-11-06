package D31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootraspDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		List<WebElement> xyz=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(xyz.size());
		
	for(WebElement lis: xyz)
		{
		    lis.click();
			System.out.println(lis.getText());
			
		} 
		
		/*	for(WebElement lis: xyz)
		{
			String names=lis.getText();
			if(names.equals("HTML"))
					{
				       lis.click();
					}  */
			
		}
	}


