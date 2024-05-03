package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MRP {
public static void main(String[] args) throws InterruptedException {
	for(int i=0;i<= 3;i++) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
}
}
}
