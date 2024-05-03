package praticeselenium;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

 class taskfb {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
 Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavan");
 
 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("smarty");
 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pavank1222@.com");
 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("7013183416");
 
 driver.findElement(By.xpath("//select[@id='day']")).sendKeys("24");
 driver.findElement(By.xpath("//select[@id='month']")).sendKeys("oct");
 driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
 driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click(); 
	}
 }