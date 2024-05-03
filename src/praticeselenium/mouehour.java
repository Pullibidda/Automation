package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.tethering.model.Accepted;
import org.openqa.selenium.interactions.Actions;

public class mouehour {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		 Thread.sleep(3000);
    Actions act=new Actions(driver);
    WebElement men=driver.findElement(By.xpath("(//a[@class=' alignTag'])[1]"));
    act.moveToElement(men).build().perform();
    Thread.sleep(3000);
		act.contextClick(men).build().perform();
		act.doubleClick(men).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
