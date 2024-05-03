package praticeselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class three {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
	Thread.sleep(3000);
	 driver.navigate().to("https://www.facebook.com");
	 Thread.sleep(4000);
	 driver.switchTo();
	 driver.close();
	  driver.quit();
	  
	}

	}