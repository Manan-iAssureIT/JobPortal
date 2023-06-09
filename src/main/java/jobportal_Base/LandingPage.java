package jobportal_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
	
	
	
	@FindBy(name="loginusername")
	WebElement loginemail;
	
	@FindBy(id="password")
	WebElement password1;
	
	@FindBy(className="btn col-lg-6 buttonSignIn")
	WebElement loginbtn;
	
		

	public void gotolandingpage(String url)
	{
		driver.get(url);
		driver.manage().window().fullscreen();
	}
	
	public void LoginApplication(String username,String pass)
	{
		loginemail.sendKeys(username);
		password1.sendKeys(pass);
		loginbtn.click();
	}
	}
	
	
	

