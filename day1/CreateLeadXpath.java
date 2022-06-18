package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath extends AnnotationLearn{

	@Test
	public void createContact() throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Dedalus");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vino");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Chan");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Create Lead test");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610783341");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("vinodhinichandrakasan@gmail.com");
		 WebElement ele1 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 System.out.println(driver.getTitle());
		
		 
	}

}
