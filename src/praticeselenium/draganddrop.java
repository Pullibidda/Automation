package praticeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		WebElement src =driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement dest= driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();

	}

}
