package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment1DWShomepage {
	
	@Test
	public void homePage() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		DWShomepage ref = new DWShomepage(driver);
		
		ref.logo;
		ref.register;
		ref.login;
		ref.Shopping_cart;
		ref.wishlist;
		ref.books;
		ref.computers;
		ref.Community_poll;
		ref.digital_download;
		ref.jewelry;
		ref.gift_cardas;
		ref.Newsletter;
		ref.newsletter;
		ref.Community_poll;
	}
}
