package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Kaladevi");
		driver.findElement(By.id("lastNameField")).sendKeys("R");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kala");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.name("departmentName")).sendKeys("HR");
		driver.findElement(By.name("description")).sendKeys("Details about Kaladevi");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kala-23@gmail.com");
		WebElement dropdown= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s=new  Select(dropdown);
		s.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Family detail");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("The Resulting Page Title is" +driver.getTitle());
		
		
		
	}

}
