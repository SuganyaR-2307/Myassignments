package Weektwo.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Facebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Manimaran");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("K");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("98762309871");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sugan@1");
		WebElement dropdown1=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(dropdown1);
		s.selectByVisibleText("8");
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(dropdown2);
		s1.selectByIndex(4);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1996");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
	}
}
