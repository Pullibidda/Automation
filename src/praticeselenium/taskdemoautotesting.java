package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.accessibility.model.AXNodeId;
import org.openqa.selenium.interactions.Actions;

public class taskdemoautotesting {

	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Thread.sleep(3000);

driver.switchTo().alert().accept();
driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();

driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
Thread.sleep(3000);
System.out.println(driver.switchTo().alert().getText());










	}
	
	
	
	
	
	
	
	
	
	
}