package D30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIF {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement web=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(web);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Abc");
		
		driver.switchTo().defaultContent();
		
		WebElement web2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(web2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("XYZ");
		
		driver.switchTo().defaultContent();
		
		WebElement web3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(web3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("AXM");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		
	}

}
