package D38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesss {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new  ");
		
	//	[[option.setAcceptInsecureCerts(true);   Used to handle SSL ERROR]]
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		System.out.println(driver.getTitle());
		
	}

}
