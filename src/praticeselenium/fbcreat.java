package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.model.AudioListenerWillBeDestroyed;

public class fbcreat {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("pavank",Keys.TAB,"mogili",Keys.TAB,"mpavank1222@gmail.com",Keys.TAB,"123456",Keys.ENTER);
	driver.findElement(By.xpath("//select[@id='day']")).sendKeys("24",Keys.TAB,"oct",Keys.TAB,"1998",Keys.ENTER);
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

}
