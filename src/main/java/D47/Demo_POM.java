package D47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo_POM {
	
	WebDriver driver;
	//Contructor
	
	Demo_POM (WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this );
	}

	//Locators
	@FindBy (xpath="//input[@type='text'] ")
	WebElement username;
	
	@FindBy (xpath="//input[@type='password']")  
	WebElement password;
	
	@FindBy (xpath =" //input[@type='submit'] ")
	WebElement submit;
	
	
	//
	public void perform_act(String un, String pw)
	{
		
		username.sendKeys(un);
		password.sendKeys(pw);
     }
	public void logged()
	{
		submit.click();
	}
}