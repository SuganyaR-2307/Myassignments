package weekfour.day1;

import java.time.Duration;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MS",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU",Keys.TAB);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	//Find Table
		WebElement eletable = driver.findElement(By.xpath("//div[@id='divMain']//table"));
	//find rows
	     List<WebElement> elerows = eletable.findElements(By.tagName("tr"));
	     for(int i=0;i<elerows.size();i++)
	     {
	    	 WebElement row = elerows.get(i);
	    	 
	//find columns and print all the table values
	    	 List<WebElement> elecolumns = row.findElements(By.tagName("td"));
	    	 for(int j=0;j<elecolumns.size();j++)
	    	 {
	    		WebElement column = elecolumns.get(j); 
	    		System.out.print(column.getText()+"    ");
	    		
	    	 }
	    	 System.out.println("");  
	     }
   //print Train name alone
	     System.out.println("***PRINT TRAIN NAME***");
	     List<String> namelist1= new ArrayList<String>();
	     for(int i=0;i<elerows.size();i++)
	     {
	    	 WebElement row = elerows.get(i);
	    	 List<WebElement> elecolumns = row.findElements(By.tagName("td"));
	    	for(int j=0;j<elecolumns.size();j++)
	    	{
	    		 WebElement column = elecolumns.get(1); 
	    		
	    		 namelist1.add(column.getText());
	    		 
	    		    		
	         }
	     }
	     driver.findElement(By.xpath("//div[@id='divMain']//a)[2]")).click();
	     List<String> namelist2= new ArrayList<String>();
	     for(int i=0;i<elerows.size();i++)
	     {
	    	 WebElement row = elerows.get(i);
	    	 List<WebElement> elecolumns = row.findElements(By.tagName("td"));
	    	for(int j=0;j<elecolumns.size();j++)
	    	{
	    		 WebElement column = elecolumns.get(1); 
	    		
	    		 namelist2.add(column.getText());
	    		 
	    		    		
	         }
	     }
	     Collections.sort(namelist1);
	   
	     System.out.println(namelist1.equals(namelist2));
	     
		
		
		
	}
	
}
