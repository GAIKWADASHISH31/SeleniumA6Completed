package BaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DWSpage {
	public static WebDriver driver;
	public static void preCondition(String browser) {
	
		if (browser.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void login() throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Email")).sendKeys("ashishgaikwad3131@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ashish@1234");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@name='RememberMe'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(500);
	}
	public static void postCondition() {
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}
	
}
