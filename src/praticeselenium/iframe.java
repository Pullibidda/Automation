package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class iframe {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
 driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("pavank");
		
	//driver.switchTo().parentFrame();
	Thread.sleep(3000);
	//driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//input[@name='lname']")).clear();
	
	driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("mogili");
	//driver.switchTo().parentFrame();
	Thread.sleep(5000);
	//driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//input[@value='Submit']")).click(); 
}
}