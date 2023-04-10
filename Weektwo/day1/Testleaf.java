package Weektwo.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf {
public static void main(String[] args) {
	//initialize chrome driver and open it
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control.main");
	
	//maximize the driver
	driver.manage().window().maximize();
	//Find Element username and send value
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("DemoSalesManager");
	//find Element Password and send value
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	
	//Find Element for Button and perform action
	WebElement login=driver.findElement(By.className("decorativeSubmit"));
	login.click();
	
	//Find element hyperlink and click
	WebElement link=driver.findElement(By.linkText("CRM/SFA"));
	link.click();
	WebElement Leadlink=driver.findElement(By.linkText("Leads"));
	Leadlink.click();
	WebElement createLeadlink=driver.findElement(By.linkText("Create Lead"));
	createLeadlink.click();
	//Find element  company name,first name and last name and send value  for all
	WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
	companyname.sendKeys("ABC");
	WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
	firstname.sendKeys("SuganyaRajendran");
	WebElement lastname=driver.findElement(By.id("createLeadForm_lastName"));
	lastname.sendKeys("R");
	
	//Diff methods to Send value to dropdown either by using sendkeys or Select class
	//driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Conference");
	
	WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select d=new Select(findElement);
	d.selectByVisibleText("Employee");
	//d.selectByIndex(1);
	//d.selectByValue("LEAD_WORDOFMOUTH");
	
	// click submit button
	driver.findElement(By.className("smallSubmit")).click();
     
	
	
}
}
