package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends Assignment{

	@Test
	public  void editLeads() throws InterruptedException {
		
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dedalus");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chan");
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vi");
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		 driver.findElement(By.name("description")).sendKeys("Create Lead");
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinodhinichandrakasan@gmail.com");
		 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select city=new Select(ele1);
		 city.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateLeadForm_description")).clear();
		 driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("New test notes are added");
		 Thread.sleep(2000);
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println(driver.getTitle());
		

	}

}
