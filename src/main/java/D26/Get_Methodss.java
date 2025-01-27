package D26;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methodss {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.getTitle();
		boolean str=driver.findElement(By.xpath("//h1[@class='title']")).isDisplayed();
	    System.out.println(str);
	    boolean str1=driver.findElement(By.xpath("//input[@id='name']")).isEnabled();
	    System.out.println(str1);
	    boolean str2=driver.findElement(By.xpath("//input[@id='female']")).isSelected();
	    System.out.println(str2);
	    System.out.println("abc");	}	

}
