package praticeselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class multipelprogram {
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__register']")).click();
	
	driver.findElement(By.xpath("//span[@class='google-text']")).click();
	Thread.sleep(3000);
	
	
	
	

	
	
	
	

	
	
	
	
	
	
}
}
