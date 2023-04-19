package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Checkbox {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		WebElement checkbox=driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		checkbox.click();
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		boolean status=driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']")).isEnabled();
		if(status==false)
		{
			System.out.println("Checkbox is disabled ");
		}
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]")).click();
//Select multiple option
		//WebElement check1=driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']"));
		
		
//Tri state checkbox
		
	WebElement ch1=	driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]"));
	Select dd=new Select(ch1);
	List<WebElement> options=dd.getOptions();
	int size=options.size();
	for(int i=0;i<size;i++)
	{
		if(i==2)
		{
			options.get(i).click();
		}
		
	}
		
		
	}

}
