package D37;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		//SINGLE Files
	//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\udayl.INFICS\\Desktop\\Details.txt ");
		
		//Multiple Files
		String Fil1="C:\\Users\\udayl.INFICS\\Desktop\\Details.txt";
		String Fil2="C:\\Users\\udayl.INFICS\\Desktop\\helperclas.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(Fil1+ "\n" +Fil2);
		
		//VALIDATE TOTAL FILES
		int Totalfile=driver.findElements(By.xpath("//ul[@id='fileList'] //li ")).size();
		
		//VALIDATE FILES NAMES
		if(driver.findElement(By.xpath("//ul[@id='fileList'] //li[1]")).getText().equals("Details.txt")
				&& driver.findElement(By.xpath("//ul[@id='fileList'] //li[2]")).getText().equals("helperclas.txt"))
				{
			      System.out.println("Files uploaded correctly");
				}
		else {
			 System.out.println("Files nott uploaded correctly");
			 
		}
		
		if(Totalfile==2)
		{
			System.out.println("true");
		}
		
	}
     
	
}
