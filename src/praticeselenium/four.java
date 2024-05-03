package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();

driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com");

driver.findElement(By.xpath("//a[@class='ico-login']")).click();

driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("mpavank@120131email.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pavan-N");

driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	

}
