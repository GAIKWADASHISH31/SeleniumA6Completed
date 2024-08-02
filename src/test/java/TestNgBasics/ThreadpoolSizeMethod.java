package TestNgBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ThreadpoolSizeMethod {
	
	@Test(priority = 'a',invocationCount = 4,threadPoolSize = 2)
	public void CSK() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chennaisuperkings.com/");
		Thread.sleep(1000);
		driver.close();
	}
	@Test(priority = 'c',invocationCount = 3,threadPoolSize = 2)
	public void MumbaiIndians() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mumbaiindians.com//");
		Thread.sleep(1000);
		driver.close();
	}
	@Test(priority = 'b',invocationCount = 2,threadPoolSize = 2)
	public void rcb() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(1000);
		driver.close();
	}
		
}

