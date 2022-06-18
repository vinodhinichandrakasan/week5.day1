package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends Assignment{

	@Test
	public void createLead() {
		// TODO Auto-generated method stub
		 
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dedalus");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chan");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.name("description")).sendKeys("Create Lead");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8610783341");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinodhinichandrakasan@gmail.com");
		 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
			/*
			 * WebElement dropdown =
			 * driver.findElement(By.id("createLeadForm_dataSourceId")); Select obj=new
			 * Select(dropdown); obj.selectByValue("LEAD_CONFERENCE"); driver.close();
			 */		 
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		 //driver.close();
	}

}
