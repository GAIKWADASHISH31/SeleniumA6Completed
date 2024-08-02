package Listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Com.Crm.Listeners1.Basic.class)

public class TestCasesBasic  {
	
	@Test
	public void main1() {
		
	String excepted_result ="https://demowebshop.tricentis.com/";
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
	driver.get("https://demowebshop.tricentis.com/");
	String actual_result = driver.getCurrentUrl();
	assertEquals(excepted_result,actual_result );
	Reporter.log("main1",true);
	}
	@Test
 void main2() {
		
	String excepted_result ="https://demowebshop.tricentis.com";
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15));
	driver.get("https://demowebshop.tricentis.com");
	String actual_result = driver.getCurrentUrl();
	assertEquals(excepted_result,actual_result );
	Reporter.log("main2",true);
	}

}
