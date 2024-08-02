package BaseClass;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DwsScreenShot {
	
	public static WebDriver driver;
	@BeforeClass
	public void preCondition() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
@BeforeMethod
public void beforeMethod() {
	Reporter.log("Welcome to DWS Site");
}
@AfterMethod
public void afterMethod() {
	Reporter.log("Thank you for the visit");
}
@AfterClass
public void afterClass() {
	driver.quit();
}
}