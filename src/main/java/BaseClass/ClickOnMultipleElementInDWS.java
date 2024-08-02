package BaseClass;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ClickOnMultipleElementInDWS {
	
	public WebDriver driver;
	
	@org.testng.annotations.Parameters({"browser","url"})
	@BeforeClass
	public void preCondition(String browser,String Url)
	{
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else 
		{
		driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(Url);
	}
	@BeforeMethod
	public void login()
	{
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin01@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin01");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
	@AfterMethod
	public void logout()
	{
		
		driver.findElement(By.xpath("ico-logout")).click();
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
