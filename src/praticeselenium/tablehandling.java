package praticeselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class tablehandling {

	public static void main(String[] args)throws Exception {
	
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.dezlearn.com/webtable-example/");
			Thread.sleep(4000);
			WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
			List<WebElement>rows=table.findElements(By.tagName("tr"));
			System.out.println(rows.size());
			Thread.sleep(4000);
			List<WebElement> heads=table.findElements(By.tagName("th"));
			System.out.println(heads.size());
			Thread.sleep(4000);
			for (int i=0;i<heads.size();i++) {
			System.out.println(heads.get(i).getText());
			}
			Thread.sleep(4000);
			List<WebElement>cols=table.findElements(By.tagName("td"));
			System.out.println(cols.size());
			for(int i=0;i<cols.size();i++) {
				Thread.sleep(4000);
	 System.out.println(cols.get(i).getText());
				}
 for(int i=1;i<rows.size();i++) {
	 
	 List<WebElement>col=rows.get(i).findElements(By.tagName("td"));
	 Thread.sleep(4000);
	 for (int j=1;j<col.size();i++) {
		 
	 }
 }
}
}
