package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTR01handle {
public static void main(String[] args)throws Exception {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	Thread.sleep(3000);
	driver.findElement(By.id("firstName")).sendKeys("Pavan");
	driver.findElement(By.name("lName")).sendKeys("smarty");
	Thread.sleep(3000);
	driver.findElement(By.id("malerb")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("englishchbx")).click();
	WebElement hindichk=driver.findElement(By.id("hindichbx"));
	hindichk.click();//check
	Thread.sleep(3000);
	if( hindichk.isSelected() );
	hindichk.click();//uncheak
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys("mpavank@1222");
	driver.findElement(By.id("password")).sendKeys("Pavan728265+-*/");
	Thread.sleep(3000);
	driver.findElement(By.id("registerbtn")).click();
	System.out.println(driver.findElement(By.id("msg")).getText());
	Thread.sleep(3000);
	driver.findElement(By.linkText("Click here to navigate to the home page")).click();
	Thread.sleep(3000);
	}
}
