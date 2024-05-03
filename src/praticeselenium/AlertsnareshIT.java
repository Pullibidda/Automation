package praticeselenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertsnareshIT {
public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.orangehrm.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("textuser")).sendKeys("pavankalayan");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	driver.findElement(By.name("textpassword")).sendKeys("pavank");
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	System.out.println("logout completed");
	
	
	
}
}
