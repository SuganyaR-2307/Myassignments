package Weektwo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MNC");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pranav");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("NoNu");
	driver.findElement(By.name("departmentName")).sendKeys("IT");
	driver.findElement(By.className("inputBox")).sendKeys("Nothing");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pranav12@gmail.com");
	WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select dd=new Select(dropdown);
	dd.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println("Title Of the Resulting Page: "+driver.getTitle());
}
}
