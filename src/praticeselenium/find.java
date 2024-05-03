package praticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.netty.handler.codec.http.LastHttpContent;

public class find {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
	Thread.sleep(3000);
	List<WebElement>all=driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	System.out.println(all.size());
	
	for(int i=0;i<all.size();i++) {
		System.out.println(all.get(i).getText());
	}
Thread.sleep(3000);
all.get(6).click();
for(int i=0;i<all.size();i++) {
	if (all.get(6).getText().contains("mobile5g")) {
		
	}
	
}
}
}