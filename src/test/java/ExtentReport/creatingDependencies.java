package ExtentReport;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class creatingDependencies {
	
	@Test(priority = 1)
	public void createAccount() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Reporter.log("Account is Created....",true);
	}
	@Test(priority = 0,dependsOnMethods = "createAccount")
public void deleteAccount() {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Reporter.log("Account is Deleted.....",true);
	}
	

}
