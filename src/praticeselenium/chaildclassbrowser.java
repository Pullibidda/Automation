package praticeselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
  
public class chaildclassbrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000");
driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
String mainwindowit = driver.getTitle();
Thread.sleep(4000);
 System.out.println(mainwindowit);
Set<String> allwin = driver.getWindowHandles();
for(String cwin:allwin) {
	driver.switchTo().window(cwin);
	Thread.sleep(4000);
}
String cwtit = driver.getTitle();
System.out.println(cwtit);
Thread.sleep(4000);
}


}


