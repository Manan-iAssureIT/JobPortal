package jobportal_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUp extends JobPortal_Base
{
	@Test
	public static void signup() throws InterruptedException
	{
	JobPortal_Base obj2 = new JobPortal_Base();
	obj2.SetUp();	
	driver.findElement(By.xpath("//a[@class=\"loginSignUp\"]")).click();
	driver.findElement(By.xpath("//input[@name=\"companyName\"]")).sendKeys("HSBC");
	driver.findElement(By.xpath("//input[@name=\"branch\"]")).sendKeys("pune");
	WebElement state = driver.findElement(By.xpath("//select[@id=\"states\"]"));
	state.click();
	Select sel1 = new Select(state);
	sel1.selectByVisibleText("Maharashtra");
	
	driver.findElement(By.xpath("//input[@id=\"companyCountry\"]")).sendKeys("India");
	driver.findElement(By.xpath("//button[@class=\"buttonNext col-lg-5 pull-right\"]")).click();
	
	//screen2 
	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Ritvij");
	driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Kulkarni");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ritvij.g@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"phone-form-control\"]")).sendKeys("9145432828");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys("123456789");
	driver.findElement(By.xpath("//input[@id=\"checkTC\"]")).click();
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[3]/form/div[13]/div/button")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/button[1]")).click();

//screen 3

driver.findElement(By.xpath("//input[@id=\"otp1\"]")).sendKeys("1");
driver.findElement(By.xpath("//input[@id=\"otp2\"]")).sendKeys("2");
driver.findElement(By.xpath("//input[@id=\"otp3\"]")).sendKeys("3");
driver.findElement(By.xpath("//input[@id=\"otp4\"]")).sendKeys("4");
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[4]/form/div[9]/div[2]/button")).click();
//screen 4
driver.findElement(By.xpath("//div[@class=\"swal2-actions\"]")).click();

System.out.println("Welcome to iAssure International Technologies PVt Ltd.");

//driver.switchTo().activeElement().click();
	
	
	
	}
}
	
	


	
	
	


