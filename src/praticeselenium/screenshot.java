package praticeselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver Driver=new ChromeDriver();
Driver .manage().window().maximize();
Driver.get("https://www.google.com");
TakesScreenshot tss=(TakesScreenshot) Driver;
File src=tss.getScreenshotAs(OutputType.FILE);
File target=new File("C:\\Users\\pavan\\eclipse-workspace\\world\\Myfirstselenium\\screenshot\\photo.png");
Files.copy(src, target);
	}

}
