package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		registerlink.click();
		WebElement firstname=driver.findElement(By.name("FirstName"));
		firstname.sendKeys("surya");
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys("venu");
	}

}
