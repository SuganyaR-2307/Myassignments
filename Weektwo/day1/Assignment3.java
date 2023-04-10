package Weektwo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CGA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vanitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vani");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Vani@gmail.com");
		WebElement dropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(dropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Result Page Title is "+driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACG");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anitha");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The Result Page Title is "+driver.getTitle());
		
		
	}
}
