package praticeselenium;

import java.awt.Window;
import java.sql.Driver;

import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.get("https://www.youtube.com");
		driver.navigate().to("https://www.myntra.com");
		driver.switchTo();
		Thread.sleep(3000);
		driver.navigate().to("https://www.bigbazar.com");
		Thread.sleep(3000);
		driver.navigate().to("https://www.twiter.com");
		
		driver.close();
		driver.quit();
	
	}
		
				
		
	}
	


