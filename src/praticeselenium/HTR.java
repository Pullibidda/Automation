package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTR{
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/login");
			WebElement usernameText=driver.findElement(By.id("login_field"));
			
			if(usernameText.isDisplayed()){
				if(usernameText.isEnabled()){
					usernameText.sendKeys("pavan");
				  String enteredText=usernameText.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(2000);
				usernameText.clear();
				}
				else
				    System.err.println("username textbox is not enabled");

				}
				else
				System.err.println("username Textbis not displayed");
				
				

		}
	}