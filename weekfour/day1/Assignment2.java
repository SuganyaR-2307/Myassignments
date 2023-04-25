package weekfour.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("*******PRINT RESPECTIVE VALUE *******************");
	WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	String lname="Absolute Usage";
	for(int i=0;i<rows.size();i++)
	{
		WebElement row = rows.get(i);
		List<WebElement> columns = row.findElements(By.tagName("td"));
		for(int j=0;j<columns.size();j++)
		{
			WebElement col = columns.get(0);
			String libvalue=col.getText();
			WebElement column = columns.get(j);
			if(libvalue.equals(lname))
			{
			System.out.print(column.getText()+" ");
			}
		}
		System.out.println("");
	}
}
		
		
}
	
	


