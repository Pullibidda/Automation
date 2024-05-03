package praticeselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class datareading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File f=new File("C:\\Users\\pavan\\eclipse-workspace\\world\\Myfirstselenium\\configiratons\\data.properties");
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("id"));
		
		
		
	
		
		
		
		
		
		  
		
		
		
		
		

	}

}
