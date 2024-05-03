package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class fbdayselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("pavan");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("mogili");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("mpavank12222gmail.com");
		
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")).sendKeys("7013183416");
		
		
		
		
		
		
		
	}

}
