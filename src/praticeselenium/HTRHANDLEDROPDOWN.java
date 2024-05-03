package praticeselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HTRHANDLEDROPDOWN {
public static void main(String[] args) throws Exception {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	Thread.sleep(3000);
	WebElement courseElement=driver.findElement(By.id("course"));
	Select courseNameDropDown=new Select(courseElement);
	Thread.sleep(3000);
	List<WebElement>courseNameDropDownOptions=  courseNameDropDown.getOptions();
	for (WebElement option:courseNameDropDownOptions) {
		System.out.println(option.getText());
		Thread.sleep(3000);
	}
	
	courseNameDropDown.selectByIndex(1);//java
	Thread.sleep(3000);
	//selectByValue("net");//dot net
	Thread.sleep(3000);
courseNameDropDown.selectByVisibleText("Javascript");//Javascript 
	String selectedText =courseNameDropDown.getFirstSelectedOption().getText();	System.out.println("selected visible text-"+selectedText);
	Thread.sleep(3000);
	



WebElement ideElement=driver.findElement(By.id("ide"));
Select ideDropDown=new Select(ideElement);
Thread.sleep(3000);
List<WebElement>ideDropDownOptions=  ideDropDown.getOptions();
for (WebElement option:ideDropDownOptions) {
	System.out.println(option.getText());
	Thread.sleep(3000);
}

    ideDropDown.selectByIndex(0);//eclipse
     Thread.sleep(3000);
     ideDropDown.selectByValue("ij");//intellij IDEA
      Thread.sleep(3000);
    ideDropDown.selectByVisibleText("NetBeans");// NEtBeans
    Thread.sleep(3000);
    ideDropDown.deselectByVisibleText("intellij IDEA");
     List<WebElement> selectedOptions =ideDropDown.getAllSelectedOptions();
     Thread.sleep(3000);
     for (WebElement selectedOption: selectedOptions) {
    System.out.println("selected visible text-"+ selectedOption.getText());
    Thread.sleep(3000);
     }

}
}

