package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;



public class SelectAssignment {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//div[@class='grid formgrid']//select"));
	Select dd=new Select(ele);
	List<WebElement> options=dd.getOptions();
	int size=options.size();
	for(int i=0;i<size;i++)
	{
		if(i==1)
		{
			options.get(i).click();
		}
		
	}
	
	driver.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
	driver.findElement(By.xpath("//span[@class='ui-autocomplete-panel ui-widget-content ui-corner-all ui-helper-hidden ui-shadow ui-input-overlay']//li[3]")).click();
	

	
}
}
