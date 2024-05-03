package praticeselenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazondynamicdrapdown {
public static void main(String[] args) throws InterruptedException {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.google.com");
 driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("magneq");
 Thread.sleep(3000);
 List<WebElement>all=driver.findElements(By.xpath("//div[@class='pcTkSc']"));
 System.out.println(all.size());
 
 for (int i=0;i<all.size();i++){
 System.out.println(all.get(i).getText());
 }
 Thread.sleep(3000);
 all.get(2).click(); 
 
 for(int i=0;i<all.size();i++) {
	if (all.get(i).getText().contains("magneq sofware reviews")) {
		all.get(i).click();
	} 
 }
 
 } 
 }
