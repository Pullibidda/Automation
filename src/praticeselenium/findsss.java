package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class findsss {
private static WebElement gmail;

public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("(//a[@class='gb_H'])[1]"));
	Actions a=new Actions(driver);
	
	
	a.moveToElement(gmail).contextClick().perform();
}
}