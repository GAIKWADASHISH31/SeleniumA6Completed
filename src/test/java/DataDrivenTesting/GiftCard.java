package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.DWSpage;
public class GiftCard extends DWSpage {
	
	public static void main(String[] args) throws InterruptedException {
		
		preCondition("Edge");
		Thread.sleep(4000);
		login();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@href='/gift-cards'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Ashish");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("ashish31@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys("Ashish Gaikwad");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("ashishgaikwad3131@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Well-Come in GiftCard Page");
		Thread.sleep(500);
		WebElement quantity = driver.findElement(By.id("addtocart_1_EnteredQuantity"));
		quantity.clear();
		quantity.sendKeys("2");
		Thread.sleep(500);
		driver.findElement(By.id("add-to-cart-button-1")).click();
		Thread.sleep(1000);
		postCondition();
		driver.quit();
	}

}
