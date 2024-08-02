package TestNG1assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Bike {

	@Test
	public void heroHonda() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.heromotocorp.com/en-in.html");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void R15() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
		Thread.sleep(5000);
		driver.close();
	}
	@Test(groups = "regression")
	public void KTM() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/ktm-bikes/rc-200/");
		Thread.sleep(5000);
		driver.close();
	}
	@Test(groups = "regression")
	public void karizma() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bikewale.com/hero-bikes/karizma-xmr/");
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void royalEnfield() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalenfield.com/in/en/motorcycles/hunter-350/");
		Thread.sleep(10000);
		driver.close();
	}
}
