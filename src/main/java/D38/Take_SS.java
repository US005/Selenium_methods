package D38;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_SS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//FULL PAGE SS
	/*	TakesScreenshot ss= (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File Desti = new File(System.getProperty("user.dir")+ "\\Screenshots\\Fullpage.png");
		source.renameTo(Desti); //copy source file to desti location 
		
		WebElement specific = driver.findElement(By.xpath("(//div[@class='center clear']) [2]"));
		File source = specific.getScreenshotAs(OutputType.FILE);
		File Desti = new File(System.getProperty("user.dir")+ "\\Screenshots\\halfpage.png");
		source.renameTo(Desti); //copy source file to desti location */
		
		WebElement singleelement = driver.findElement(By.xpath("//img[@ data-src ='/wp-content/themes/punky/images/logo.png']"));
		File source = singleelement.getScreenshotAs(OutputType.FILE);
		File Desti = new File(System.getProperty("user.dir")+ "\\Screenshots\\Singleweb.png");
		source.renameTo(Desti); //copy source file to desti location */
		
		
	}

}
