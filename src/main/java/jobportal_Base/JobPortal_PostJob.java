package jobportal_Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobPortal_PostJob extends JobPortal_Base {
	
	
	JobPortal_Base obj1= new JobPortal_Base();
	
	
	
	@Test
	public void Postajob()
	{
		
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/div/div[2]/div/div[1]/div/a/div")).click();
driver.findElement(By.xpath("//input[@id=\"jobTitle\"]")).sendKeys("QA");

WebElement joblocation=driver.findElement(By.xpath("//input[@id=\"address\"]"));
Actions act = new Actions(driver);

joblocation.sendKeys("infosys Pune");

//act.sendKeys(joblocation,Keys.DOWN).build().perform();

//act.sendKeys(Keys.ENTER).build().perform();


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
driver.findElement(By.xpath("//div[@role=\"textbox\"]")).sendKeys("Hello we are an award winning IT company based in pune");

driver.findElement(By.xpath("//*[@id=\"addJob\"]/div[27]/button")).click();
//driver.navigate().refresh();


		}	
	
	}

