package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
	    driver.get("http://leaftaps.com/opentaps/control/login");
		//2. Enter UserName and Password Using Id Locator
	    driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 // 3. Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 System.out.println("before method");
		
	}	
	@AfterMethod
	public void postCondition()
	{
		System.out.println("after method");
		driver.close();
	}

}
