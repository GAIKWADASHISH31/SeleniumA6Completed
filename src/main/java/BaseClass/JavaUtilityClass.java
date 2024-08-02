package BaseClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtilityClass

{
	public static String loginData(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\Configurefile\\Loginfunction.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}

}