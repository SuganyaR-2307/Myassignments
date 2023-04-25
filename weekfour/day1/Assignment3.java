package weekfour.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
	WebElement tbody = table.findElement(By.tagName("tbody"));
	List<WebElement> rows = tbody.findElements(By.tagName("tr"));
	int countRow=rows.size();
	WebElement row = rows.get(1);
	List<WebElement> columns = row.findElements(By.tagName("td"));
	int countColumn=columns.size();
	System.out.println("Number of Rows in the Table : "+countRow);
	System.out.println("Number of Columns in the Table : "+countColumn);
	
}
}
