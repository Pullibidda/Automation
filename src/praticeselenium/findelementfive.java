package praticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementfive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println(links.size());
 System.out.println(links.get(0).getText());
System.out.println(links.get(5).getText());

for(int i=0;i<links.size();i++) {
System.out.println(links.get(i).getText());
	}

	}
}
