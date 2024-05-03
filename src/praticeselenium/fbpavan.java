package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbpavan {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rajesh@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc");
	driver.findElement(By.xpath("//button[.='Log in']")).click();
			

	}

}
