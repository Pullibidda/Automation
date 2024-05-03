package praticeselenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draaganddrop {
public static void main(String[] args) throws InterruptedException  {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/droppable");
	
	WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
    Actions act =new Actions(driver);
    Thread.sleep(3000);
  WebElement drop=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
  act.dragAndDrop(drag, drop).build().perform();
	
	
	
	
	
	
}
}
