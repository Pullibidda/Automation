package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hiddenpopuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("966678");
driver.findElement(By.xpath("//input[@name='submit']")).click();
driver.switchTo().alert().accept();
  String t=driver.switchTo().alert().getText();
  System.out.println(t);
  
	}

}
