package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeads extends Assignment {

	@Test
	public void find() {
		// TODO Auto-generated method stub
		 System.out.println("Find lead");	
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 

	}

}
