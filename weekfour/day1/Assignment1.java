package weekfour.day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.chittorgarh.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("(//div[@id='main-nav']//a)[5]")).click();
	driver.findElement(By.linkText("NSE Bulk Deals")).click();
	List<String> list=new ArrayList<String>();
	
	WebElement eletable = driver.findElement(By.xpath("//div[@id='report_data']//table"));
	List<WebElement> elerows = eletable.findElements(By.tagName("tr"));
	for(int i=0;i<elerows.size();i++)
	{
		WebElement row = elerows.get(i);
		List<WebElement> columns = row.findElements(By.tagName("td"));
		for(int j=0;j<columns.size();j++)
		{
			WebElement column = columns.get(0);
			list.add(column.getText());
		}
	}
	//Ensure the Security name field don't have duplicate name
	System.out.println("************SECURITY NAME************");
	Set<String> set=new TreeSet<String>(list);
	for(String eachvalue:set)
	{
		System.out.println(eachvalue);
	}
	
}
}
