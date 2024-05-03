package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Alerts.html");
	Thread.sleep(3000);	
	driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
      Thread.sleep(3000);
      driver.switchTo().alert().dismiss();
      
      driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click(); 
  driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
  Thread.sleep(2000);
  driver.switchTo().alert().sendKeys("pavan");
      driver.switchTo().alert().accept();
      
      
	}

}
