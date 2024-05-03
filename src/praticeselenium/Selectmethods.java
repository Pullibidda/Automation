package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectmethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='_ap3a _aaco _aacw _aad0 _aad7']")).click();
	driver.findElement(By.xpath("(//input[@class='_aa4b _add6 _ac4d _ap35'])[1]")).sendKeys("pavank1222@.com");
	}
}
