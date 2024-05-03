package praticeselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.serviceworker.model.RegistrationID;

public class pavan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com");
WebElement registerlink=driver.findElement(By.linkText("Register"));
registerlink.click();
driver.findElement(By.id("gender-male")).click();
WebElement firstname=driver.findElement(By.id("FirstName"));
firstname.sendKeys("pavankalyan");
WebElement lastname=driver.findElement(By.id("LastName"));
lastname.sendKeys("mogili"); 
WebElement email=driver.findElement(By.id("Email"));
email .sendKeys("mpavank@120131email.com");
WebElement password=driver.findElement(By.id("Password"));
password.sendKeys("pavan-N");
WebElement confirmpassword=driver.findElement(By.id("ConfirmPassword"));
confirmpassword.sendKeys("pavan-N");

driver.findElement(By.xpath("//input[@id='register-button']")).click();




	}

}
