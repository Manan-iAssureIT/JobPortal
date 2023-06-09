package jobportal_TestCases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jobportal_Base.JobPortal_Base;
import jobportal_Base.JobPortal_employer_login;
import jobportal_Base.LandingPage;
import jobportal_Base.UtilBase;


public class JobPortal_LoginTest extends UtilBase 
{
	

public static void main(String[] args)
{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	LandingPage lp1 = new LandingPage(driver);
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
	lp1.gotolandingpage("https://qaemployer-iassureit-jobportal.iassureit.in/");
	
	lp1.LoginApplication("1234567891","123456789");
	
	//assert.assertTrue(true,"success");
		

}
}

   


