package D35;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Dropss {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	//	driver.switchTo().frame("aswift_0");
		WebElement xy=driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement xz=driver.findElement(By.xpath("//div[@id='box101']"));
		Actions act= new Actions(driver);
		 
		act.dragAndDrop(xy, xz).build().perform();
		
	}

}
