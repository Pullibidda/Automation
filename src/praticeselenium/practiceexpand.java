package praticeselenium;

import java.io.File;
import java.io.IOException;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class practiceexpand {


public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	WebElement drag=driver.findElement(By.xpath("//div[@class='red']"));
WebElement drop=driver.findElement(By.xpath("//div[@class='span-6 dragTarg']"));

act.dragAndDrop(drag, drop).build().perform();

	WebElement drag1=driver.findElement(By.xpath("//div[@class='green']"));
	WebElement drop1=driver.findElement(By.xpath("//div[@class='span-6 dragTarg']"));
	
	act.dragAndDrop(drag1, drop1).build().perform();
	
	WebElement drag2=driver.findElement(By.xpath("//div[@class='blue']"));
	WebElement drop2=driver.findElement(By.xpath("//div[@class='span-6 dragTarg']"));
	
	act.dragAndDrop(drag2, drop2).build().perform();
	
	TakesScreenshot tss=(TakesScreenshot) driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\pavan\\eclipse-workspace\\world\\Myfirstselenium\\screenshot\\photo2.png-");
	Files.copy(src, target);
	
	
	
	
	
	
	
	
	
	
}
}
