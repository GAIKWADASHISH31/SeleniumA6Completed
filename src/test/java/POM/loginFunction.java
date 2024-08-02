package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class loginFunction {
	
@Test
public void login() throws InterruptedException {
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	DWSLogin ref = new DWSLogin(driver);
	ref.login_click.click();
	Thread.sleep(1000);
	ref.username.sendKeys("admin01@gmail.com");
	Thread.sleep(1000);
	ref.password.sendKeys("admin01");
	Thread.sleep(1000);
	ref.login_button.click();
	Thread.sleep(2000);
	driver.close();
	}
}