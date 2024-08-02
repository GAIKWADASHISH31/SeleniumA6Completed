package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertyFileOrangeHRMlogin {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\Configurefile\\OrangeHRMlogin.properties");
		prop.load(fis);
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		driver.quit();
	}
}
