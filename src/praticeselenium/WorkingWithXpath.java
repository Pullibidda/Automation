package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("__shyam__bouy__");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("shyamm3266");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
	}

}
