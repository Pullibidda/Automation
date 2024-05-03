package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooooook {

	public static void main(String[] args) {
		WebDriver driver=new  EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com",Keys.TAB,"123445677",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
