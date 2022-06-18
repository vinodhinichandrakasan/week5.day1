package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends Assignment {
	@Test
	public void createContact() {
		
				 // 5.Click on contacts Button
				 driver.findElement(By.linkText("Contacts")).click();
				 //6. Click on Create Contact
				 driver.findElement(By.linkText("Create Contact")).click();
				 //7. Enter FirstName Field Using id Locator
				 driver.findElement(By.id("firstNameField")).sendKeys("Vino");
				 //8. Enter LastName Field Using id Locator
				 driver.findElement(By.id("lastNameField")).sendKeys("Chan");
				 // 9. Enter FirstName(Local) Field Using id Locator
				 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("vinod");
				 //10. Enter LastName(Local) Field Locator
				 driver.findElement(By.name("lastNameLocal")).sendKeys("c");
				 //11. Enter Department Field Using any Locator of Your Choice
				 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing");
				 //12. Enter Description Field Using any Locator of your choice 
				 driver.findElement(By.xpath("//*[@name='description']")).sendKeys("data has been added");
				 //phone number
				 driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8610783341");
				 //13. Enter your email in the E-mail address Field using the locator of your choice
				 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vinodhinichandrakasan@gmail.com");
				 WebElement ele1 = driver.findElement(By.name("generalStateProvinceGeoId"));
				 Select city=new Select(ele1);
				 city.selectByVisibleText("New York");
				 driver.findElement(By.className("smallSubmit")).click();
				 driver.findElement(By.linkText("Edit")).click();
				 driver.findElement(By.id("updateContactForm_description")).clear();
				 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("New test notes are added");
				 
				 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
				 
				 //* 20. Get the Title of Resulting Page.
				   System.out.println(driver.getTitle());
				   
				  
				 
				
				 
				
			}

		

	}

