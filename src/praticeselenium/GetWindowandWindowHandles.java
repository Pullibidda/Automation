package praticeselenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowandWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		driver.findElement(By.id("googleSignInDesktop")).click();
		Thread.sleep(4000);
   Set<String> windows = driver.getWindowHandles();
   System.out.println(windows.size());
   for(String child:windows) {
	   if(!child.equals(parent)) {
		   driver.switchTo().window(child);
		   Thread.sleep(4000);
		   }
	   }
  
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pavank@1223gmail.com");
			
	

	}		
	}


