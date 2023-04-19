package Weektwo.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[17]")).sendKeys("nishu19@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		String Lead=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();	
		//System.out.println("First Resulting Name: "+Lead); 
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
		Thread.sleep(2000);
		String title=driver.findElement(By.xpath("(//div[@class='x-panel-tc']/div)[22]")).getText();
		if(title.equals("Duplicate Lead"))
		{
			System.out.println("Title Displaying correctly");
		}
		else
		{
			System.out.println("Displaying Wrong Title");
		}
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String duplicateLead=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		if(Lead.equals(duplicateLead))				
		{
			
			System.out.println("Duplicate Lead Name same as Captured Lead Name ");
			
				}
		else
		{
			System.out.println("Both are Different");
			
		}
		driver.close();
	}

}
