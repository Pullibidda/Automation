package praticeselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplerunprogram {
public static void main(String[] args) throws Exception  {
	for(int i=0;i>3;i++) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(3000);
	driver.close();
}
}
}
