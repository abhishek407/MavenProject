package Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testAPI {
	
	@Test
	public testAPI() throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\configPack\\config.properties");
		prop.load(file);
		

		
		
	

		
	}
		
	}


