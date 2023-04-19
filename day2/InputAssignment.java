package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputAssignment {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		//Type your name
		driver.findElement(By.xpath("//div[@class='grid formgrid']//div/input")).sendKeys("Suganya");
//Just Press Enter and confirm error message ---doubt--
		//driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[3]")).submit();
		//String error=driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		//if(error.equals("Age is mandatory"))
		//{
		//	System.out.println("Error Message Displaying Correctly");
		//}
	//Append Country to this City.
		String cityName=driver.findElement(By.xpath("(//div[@class='grid formgrid']//div)[2]/input")).getText();
		String ccName=cityName.concat(" India");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//div)[2]/input")).sendKeys(ccName);
//Click and Confirm Label Position Changes  --verify---
		
		System.out.println(driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).getLocation());
		
	//Verify if text box is disabled
		boolean status=driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		if(status)
		{
			System.out.println("Textbox is Enabled");
		}
		else
		{
			System.out.println("Textbox is Disabled");
		}
		
//Type your name and choose the third option  --not working--
		//driver.findElement(By.xpath("//div[@class='ui-autocomplete ui-autocomplete-multiple']//li/input")).sendKeys("sugan");
		//driver.findElement(By.xpath("(//span[@class='ui-autocomplete-panel ui-widget-content ui-corner-all ui-helper-hidden ui-shadow ui-input-overlay']//li)[3]")).click();
		

		
//Clear the typed text.  --not working--  
		//driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).clear();
		
		
//Type your DOB (mm/dd/yyyy) and confirm date chosen --doubt--
		
		//driver.findElement(By.xpath("//span[@class='p-datepicker ui-calendar ui-trigger-calendar ui-inputwrapper-filled']/input")).sendKeys("07/23/1991");
		
		
//Retrieve the typed text. --not working
		
		System.out.println(driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled)[2]']")).getText());
		
		//Type number and spin to confirm value changed
		
		driver.findElement(By.xpath("//span[@class='ui-spinner ui-widget ui-corner-all ui-spinner-stacked ui-inputwrapper-filled']/input")).sendKeys("2");
		driver.findElement(By.xpath("//span[@class='ui-spinner ui-widget ui-corner-all ui-spinner-stacked ui-inputwrapper-filled']//a")).click();
		driver.findElement(By.xpath("//span[@class='ui-spinner ui-widget ui-corner-all ui-spinner-stacked ui-inputwrapper-filled']//a")).click();
		
		//Type email and Tab.confirm control to move next element 
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys("s@gmail.com");
		//driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]"));
		
		//Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath("(//input[@class=\"ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all\"])[4]")).sendKeys("50");
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getText());

		
		//Type about yourself
		String text="This is Suganya  from IT Department";
		driver.findElement(By.xpath("(//div[@class='col-12'])[7]/textarea")).sendKeys(text);
		
		//Click and Confirm Keyboard appears
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		boolean status1=driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed();
		if(status1)
		{
			System.out.println("KeyBoard Displayed");
		}
		else
		{
			System.out.println("KeyBoard not Displayed");
		}
		//Text Editor
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hello How are you");
		
		//Custom Toolbar
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='ql-picker-options']/span")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[7]")).click();
		driver.findElement(By.xpath("((//span[@class='ql-picker-options'])[7]/span)[4]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Hi");
		
		
		
		
		
	}

}
