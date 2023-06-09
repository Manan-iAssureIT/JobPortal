package jobportal_Base;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JobPortal_employer_login {

	public static  WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException
	
	{			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qaemployer-iassureit-jobportal.iassureit.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		login();
		//Fill_Employer_Details();
		postajob();
		//CheckPostedJobs();
		
		//Wait();
		
		//SignOut();
		
		//CheckNotifications();
		
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
			Thread.sleep(2000);
			driver.navigate().refresh();
		//statutory details page
			driver.findElement(By.xpath("//div[@class=\"button4 AddStatutory pull-right\"]")).click();
			
			
			//driver.switchTo().alert().accept();
		}
	
		public static void postajob() throws InterruptedException
		{
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/a/div")).click();
driver.findElement(By.xpath("//input[@id=\"jobTitle\"]")).sendKeys("QA");

WebElement joblocation=driver.findElement(By.xpath("//input[@id=\"address\"]"));
Actions act = new Actions(driver);

joblocation.sendKeys("infosys Pune");

act.sendKeys(joblocation,Keys.DOWN).build().perform();

act.sendKeys(Keys.ENTER).build().perform();


System.out.println("enter clicked");
driver.findElement(By.xpath("//input[@id=\"selectFunctionalArea\"]")).sendKeys("Finance");
driver.findElement(By.xpath("//input[@id=\"selectSubFunctionalArea\"]")).sendKeys("Finance");
driver.findElement(By.xpath("//input[@id=\"selectrole\"]")).sendKeys("Tester");
//driver.findElement(By.xpath("//div[@id=\"Both (Male & Female)\"]")).click();

driver.findElement(By.xpath("//input[@list=\"jobSector\"]")).sendKeys("Private");
driver.findElement(By.xpath("//input[@list=\"jobType\"]")).sendKeys("Work from office");
driver.findElement(By.xpath("//input[@list=\"jobTime\"]")).sendKeys("Full Time");
driver.findElement(By.xpath("//input[@list=\"jobShift\"]")).sendKeys("Full Time");
driver.findElement(By.xpath("//input[@id=\"positions\"]")).sendKeys("5");
driver.findElement(By.xpath("//input[@type=\"date\"]")).sendKeys("31-05-2023");

driver.findElement(By.xpath("//input[@id=\"minSalary\"]")).sendKeys("100000");
driver.findElement(By.xpath("//input[@id=\"maxSalary\"]")).sendKeys("2000000");

driver.findElement(By.xpath("//input[@list=\"minEducation\"]")).sendKeys("Graduate");
driver.findElement(By.xpath("//input[@id=\"minExperience\"]")).sendKeys("5");

//driver.findElement(By.xpath("//div[@class=\"_2iA8p44d0WZ-WqRBGcAuEV \"]")).sendKeys("java");


//WebElement pskill =driver.findElement(By.xpath("//div[@class=\"_3vt7_Mh4hRCFbp__dFqBCI \"][1]"));
//pskill.sendKeys("Java");

//act.sendKeys(pskill,Keys.DOWN).build().perform();
//act.sendKeys(Keys.ENTER).build().perform();

//act.keyDown(Keys.ARROW_DOWN).click().build().perform();



//driver.findElement(By.xpath("//input[@id=\"minPrimExp\"]")).sendKeys("5");

//driver.findElement(By.xpath("//div[@class=\"_2iA8p44d0WZ-WqRBGcAuEV\"][2]"));
//driver.findElement(By.xpath("//input[@id=\"minSecExp\"]")).sendKeys("5");


//driver.findElement(By.xpath("//div[@class=\"_2iA8p44d0WZ-WqRBGcAuEV \"][3]"));
//driver.findElement(By.xpath("//div[@class=\"ReactTags__selected\"]")).sendKeys("Selenium");




driver.findElement(By.xpath("//input[@id=\"contactPersonName\"]")).sendKeys("Mukta Kulkarni");
driver.findElement(By.xpath("//input[@id=\"contactPersonEmail\"]")).sendKeys("Mukta.kulkarni@iAssure.com");
driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9175358359");
driver.findElement(By.xpath("//div[@role=\"textbox\"]")).sendKeys("Hello we are an award winning IT company based in pune.");

// Clicking on publish button

driver.findElement(By.xpath("//*[@id=\"addJob\"]/div[27]/button")).click();
driver.navigate().refresh();

		}
		
		// Check Posted Jobs in employer profile
		public static void CheckPostedJobs()
		{
			
			driver.findElement(By.xpath("//div[@class=\"headerToggel\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"barsToggel\"]/a[3]/div")).click();
			
		}

//input[@id="selectFunctionalArea"]

		public static void CheckNotifications() throws InterruptedException
		
		{
			
			driver.findElement(By.xpath("//div[@class=\"headerBellWrapper \"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=\"headerBellWrapper \"]")).click();
		}
		
		
		public static void Wait() throws InterruptedException
		{
			Thread.sleep(3000);
		}
		
	
		//TO sign out
		public static void SignOut()
		{
				driver.findElement(By.xpath("//i[@class=\"fa fa-caret-down profileDownArrow\"]")).click();
				
				driver.findElement(By.xpath("//div[@class=\"col-lg-5 pull-right\"]")).click();
		}
		
		

		}
		
		
		
		
		

	
		
	

		
	
		


