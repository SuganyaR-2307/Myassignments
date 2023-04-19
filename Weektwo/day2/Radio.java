package Weektwo.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[13]")).click();

	    List<WebElement> ele=new ArrayList<WebElement>();
	    ele.add(driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[16]")));
	    ele.add(driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[17]")));
	    ele.add(driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[18]")));
	    ele.add(driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default'])[19]")));
	    System.out.println("**********Find Default Radio Selection*******");
	    for(WebElement eachelement:ele)
	    {
	    	if(eachelement.isSelected())
	    	{
	    		System.out.println(eachelement.getText()+" Radio Button is Selected by Default");
	    	}
	    }
	    
	
	}

}
