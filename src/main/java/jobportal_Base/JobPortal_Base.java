package jobportal_Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JobPortal_Base {
	
	public static  WebDriver driver;
	
	
	public static void SetUp()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://qaemployer-iassureit-jobportal.iassureit.in/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	//login();
	
	}
	
	public static void login()
	{
					
	driver.findElement(By.xpath("//input[@id=\"phone-form-control\"]")).sendKeys("1234567891");
	
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456789");
	
	driver.findElement(By.xpath("//button[@class=\"btn col-lg-6 buttonSignIn\"]")).click();
	
	}

	public static void Fill_Employer_Details() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id=\"companyName\"]")).sendKeys("Capgemini");
		driver.findElement(By.xpath("//input[@id=\"groupName\"]")).sendKeys("Capgemini");
		//driver.findElement(By.xpath("//div[@id=\"LogoImageUpOne\"]")).sendKeys("//div[@id=\"LogoImageUpOne\"]");
		driver.findElement(By.xpath("//input[@id=\"selectIndustry\"]")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id=\"companyEmail\"]")).sendKeys("hr@capgemini.com");
		driver.findElement(By.xpath("//input[@name=\"companyPhone\"]")).sendKeys("02041095000");
		driver.findElement(By.xpath("//input[@id=\"website\"]")).sendKeys("www.capgemini.com");
		driver.findElement(By.xpath("//select[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id=\"TAN\"]")).sendKeys("baapg1983k");
		driver.findElement(By.xpath("//input[@id=\"CIN\"]")).sendKeys("L12345MH2019PTC123456");
		driver.findElement(By.xpath("//button[@class=\"btn button3 pull-right\"]")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	//statutory details page
		driver.findElement(By.xpath("//div[@class=\"button4 AddStatutory pull-right\"]")).click();
		
		
		//driver.switchTo().alert().accept();
	}
	

	public static void Wait() throws InterruptedException
	{
		Thread.sleep(3000);
	}


}

	
