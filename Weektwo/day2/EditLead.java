package Weektwo.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	//Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("Nishanth");
   //Click Find leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center']//button)[7]")).click();
   //Click on first resulting lead
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
   //Verify title of the page
		String Title=driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		if(Title.equals("View Lead"))
		{
			System.out.println("Title of the page is correctly display as "+Title);
		}
		else
		{
			System.out.println("Title of the page is wrongly displayed");
		}
	//Click Edit
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	//Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String cName="XYZ";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(cName);
     // Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	// Confirm the changed name appears
		String rName= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(cName.equals(rName))
		{
			System.out.println("Wrongly Updated Company Name");
		}
		else
		{
			System.out.println("Updated Company Name correctly");
		}
	//Close Browser
		driver.close();
		
		
		
		}
		
		
	}


