package weekfour.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//drag and drop anywhere
	WebElement element = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
	Actions builder=new Actions(driver);
	builder.dragAndDropBy(element, 100, 100).perform();
//drag and drop targeted 
	WebElement dropele = driver.findElement(By.id("form:drop_content"));
	WebElement dragele = driver.findElement(By.id("form:drag_content"));
	builder.dragAndDrop(dragele, dropele).perform();
//drag column
	Thread.sleep(2000);
	WebElement dragcolumntarget = driver.findElement(By.xpath("//div[@id='form:j_idt111']//table//th"));
	WebElement dropcolumntarget = driver.findElement(By.xpath("//div[@id='form:j_idt111']//table//th[3]"));
	builder.dragAndDrop(dragcolumntarget, dropcolumntarget).perform();
//drag row
	WebElement dragrowtarget = driver.findElement(By.xpath("(//div[@id='form:j_idt111']//table//tr)[2]"));
	WebElement droprowtarget = driver.findElement(By.xpath("(//div[@id='form:j_idt111']//table//tr)[4]"));
	builder.dragAndDrop(dragrowtarget, droprowtarget).perform();
//drag range slider
	WebElement dragslider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']/following-sibling::span"));
	builder.dragAndDropBy(dragslider, 20, 20).perform();
	
}
}
