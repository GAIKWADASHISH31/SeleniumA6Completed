

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UtilityClassDWSpagePropertiesFile {

	public static String main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\Configurefile\\Loginfunction.properties");
		prop.load(fis);
		String data = prop.getProperty("data");
		return data;
		
	}

}
