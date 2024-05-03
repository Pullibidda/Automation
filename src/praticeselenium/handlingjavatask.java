package praticeselenium;

import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class handlingjavatask {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		
		List<WebElement> rows=table.findElements(By.tagName("tṛ"));
		System.out.println("the rows count is"+rows.size());
		
		List<WebElement> head=table.findElements(By.tagName("th"));
		System.out.println("the head count is"+head.size());
		
for(WebElement webElement:head) {
System.out.println(webElement.getText());

	}

}
}
