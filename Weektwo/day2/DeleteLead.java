package Weektwo.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("234561");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
   //Capture lead ID of First Resulting lead
		Thread.sleep(2000);
		WebElement grid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	     
		String LeadID=grid.getText();
		System.out.println("Lead ID:"+LeadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(LeadID);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
  //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Thread.sleep(2000);
		String Message=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(Message.equals("No records to display"))
		{
		 System.out.println("No Records available under this Lead Contact So Record Deleted successfully");
		}
		else
		{
			System.out.println("Record not deleted successfully");
		}
	
		driver.close();

	
}
}