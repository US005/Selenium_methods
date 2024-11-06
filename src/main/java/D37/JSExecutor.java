package D37;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSExecutor {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/ ");
		driver.manage().window().maximize();
        WebElement searchs=  driver.findElement(By.xpath("//input[@id='small-searchterms'] "));
        
        //Send_Keys Using JS
        JavascriptExecutor js= (JavascriptExecutor) driver;
/*        js.executeScript("arguments[0].setAttribute('value','ABC')", searchs);
    
        //CLICK Using JS
        WebElement clks=  driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click()", clks);  
        
        
        //Scroll by Pixel Number
        js.executeScript("window.scrollBy(0,1050)", "");
        System.out.println(js.executeScript("return window.pageYOffset; ")); 
        
        //SCroll By Visible
        WebElement vis=  driver.findElement(By.xpath("(//a[@rel='noopener noreferrer']) [2]"));
        js.executeScript("arguments[0].scrollIntoView();", vis);
        System.out.println(js.executeScript("return window.pageYOffset; "));    */ 
        
        //Scroll end of page
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset; "));  
        
        //Scroll Top
        js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset; "));   
	}
	

}
