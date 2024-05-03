package praticeselenium;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.dynamic.loading.ByteArrayClassLoader.ChildFirst;

public class workingwithmultiplehandle {
public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.foundit.in");
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='btnSocial googleBtn']")).click();
	Thread.sleep(3000);
	Set<String> windows=driver.getWindowHandles();
	System.out.println(windows.size());
	Thread.sleep(3000);
	for(String child:windows) {
		if (!child.equals(parent)) {
			driver.switchTo().window(child);
		}
	}
	driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]")).sendKeys("pavan122com");
	
	/*TakesScreenshot tss=(TakesScreenshot) driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	File target=new File("C:\\Users\\pavan\\eclipse-workspace\\world\\Myfirstselenium\\screenshot\\photo4.png");
	Files.copy(src, target);*/
	
}
}
