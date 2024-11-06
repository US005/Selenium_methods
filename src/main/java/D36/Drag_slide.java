package D36;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_slide {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		WebElement Right=driver.findElement(By.xpath("//span[@style='left: 0%;']"));
		WebElement Left =driver.findElement(By.xpath( "//span[@style='left: 100%;']"));
		System.out.println(Right.getLocation());
		System.out.println(Left.getLocation());
		act.dragAndDropBy(Right, 100, 250).build().perform();
		act.dragAndDropBy(Left, -100, 250).build().perform();
	}

}
