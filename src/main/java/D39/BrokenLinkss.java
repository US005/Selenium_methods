package D39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		List<WebElement> hyperlinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links=" + hyperlinks.size());
		
		for(WebElement hrefAttribute:hyperlinks)
		{
			String hrefatValues=hrefAttribute.getAttribute("href");
			if(hrefatValues==null || hrefatValues.isEmpty())
			{			
			   System.out.println("Not a valid hyperlin");
			   continue;
			} 
		
		
		try
	{	
		URL linksURL = new URL(hrefatValues);
		HttpURLConnection conn= (HttpURLConnection) linksURL.openConnection(); //OPEN CONNECTION WITH SERVER
		conn.connect();  // CONNECTION WITH SERVER
		
		if(conn.getResponseCode()>=400)
		{
			System.out.println(hrefatValues+ "==broekn Link");
		}
		else
		{	
			System.out.println(hrefatValues  +"==Not a Broken Link");
		}
		
	}catch(Exception e)	
		{
		
		}
		
	}	
		
	}
}
