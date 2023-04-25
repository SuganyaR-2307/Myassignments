package weekfour.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/table.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement eletable = driver.findElement(By.xpath("(//div[@class='grid table-demo']//table)[2]"));
	List<WebElement> elerows = eletable.findElements(By.tagName("tr"));
	for(int i=0;i<elerows.size();i++)
	{
		WebElement row = elerows.get(i);
		List<WebElement> columns = row.findElements(By.tagName("td"));
		for(int j=0;i<columns.size();j++)
		{
			 WebElement column = columns.get(j);
			 System.out.print(column.getText()+"  ");
		}
		System.out.println(" ");
		
	}
	
}
}
