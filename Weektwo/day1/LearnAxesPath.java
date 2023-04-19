package Weektwo.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesPath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control.main");
		
		//maximize the driver
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Company Name')]/following::input")).sendKeys("ABC");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_lastName']/preceding::input)[40]")).sendKeys("Raghu");
		driver.findElement(By.xpath("(//input[@id='createLeadForm_firstNameLocal']/preceding::input)[41]")).sendKeys("Kannan");
		driver.findElement(By.xpath("(//div[@class='fieldgroup']//input)[29]")).click();
	}
}
