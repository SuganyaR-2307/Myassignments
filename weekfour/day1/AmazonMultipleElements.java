package weekfour.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class AmazonMultipleElements {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oppo",Keys.ENTER);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sg-row']//h2"));
		List<WebElement> elements2 = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for(int i=0;i<elements.size();i++)
		{
			
			System.out.println(elements.get(i).getText());
			System.out.println(elements2.get(i).getText());
		}
		
	}
	

}
