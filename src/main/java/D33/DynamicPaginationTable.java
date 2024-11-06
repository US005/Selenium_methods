package D33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.opencart.com/admin/");
		driver.findElement(By.xpath("//button[@type='submit'] ")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='#collapse-5'] ")).click();
		
		driver.findElement(By.xpath("//ul[@id='collapse-5'] //a[contains(text(), 'Customers')]")).click();
	}

}
