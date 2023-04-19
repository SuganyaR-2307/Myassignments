package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ButtonAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
	//Click and Confirm title  **ASK is there any method to go back***
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println("Title of the Page: "+ driver.getTitle());
       driver.navigate().back();
       
	//Confirm if the button is disabled
		boolean status=driver.findElement(By.xpath("(//div[@class='card'])[2]/button")).isEnabled();
		if(status==false)
		{
			System.out.println("Button is Disabled");
		}
		else
		{
			System.out.println("Button is Enabled");
		}
	//Find the position of the Submit button
		System.out.println("Position of the Button"+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
	//Find the Save button color
		System.out.println("Button Colour"+driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color"));
	//Find the height and width of this button
		int height=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getHeight();
		int width=driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize().getWidth();
		System.out.println("Height of the Button:"+height);
		System.out.println("Width of the Button:"+width);
	//Mouse over and confirm the color changed
        driver.findElement(By.xpath("//span[text()='Success']")).click();
				
	//Click Image Button and Click on any hidden button
		
		driver.findElement(By.xpath("//button[@name='j_idt88:j_idt102:imageBtn']")).click();
	//How many rounded buttons are there?
		driver.findElement(By.xpath("(//div[@class='card'])[7]")).click();
		
		
		
		
	}

}
