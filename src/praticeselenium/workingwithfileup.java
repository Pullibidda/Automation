package praticeselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class workingwithfileup {

public static void main(String[] args) throws InterruptedException, AWTException, IOException {


		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__register']")).click();
		
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
	
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		driver.findElement(By.xpath("//h2[@class='main-3']")).click();
		Thread.sleep(3000);
		
driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();
		Thread.sleep(3000);
		
		String s="C:\\Users\\pavan\\Documents\\Share 'M Pavan kalyan resume.docx' (1)";
		StringSelection select=new StringSelection(s);
		Thread.sleep(3000);
		Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(select, select);
		Thread.sleep(3000);
		
		Robot robo=new Robot();
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		robo.delay(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
 File target=new File("C:\\Users\\pavan\\eclipse-workspace\\world\\Myfirstselenium\\screenshot\\photo5.png");
		Files.copy(src, target);
		Thread.sleep(3000);
		
	}

}
