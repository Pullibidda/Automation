package praticeselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class fileclip {

	
		public static void main(String[] args) throws InterruptedException, AWTException {

			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.naukri.com");

			driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
			Thread.sleep(3000);

			WebElement amExp= driver.findElement(By.xpath("//button[@type='submit']"));

			Thread.sleep(3000);

			JavascriptExecutor jse=(JavascriptExecutor) driver;

			jse.executeScript("arguments[0].scrollIntoView();", amExp);

			driver.findElement(By.xpath("(//*[@class='focusable optionWrap ])[1]")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']")).click();

			Thread.sleep(3000);

			String s = "C:\\Users\\pavan\\Documents\\Share 'M Pavan kalyan resume.docx' (1)";

			StringSelection Select = new StringSelection(s);

			Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();

			clip.setContents(Select, Select);

			Thread.sleep(3000);

			Robot robo = new Robot();

			robo.keyPress (KeyEvent.VK_CONTROL);
			robo.keyPress (KeyEvent.VK_V);

			robo.delay(2000);
			
			robo.keyRelease (KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);

			robo.keyPress (KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);

	


 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
