package ConfigurationTestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.ClickOnMultipleElementInDWS;



public class ConfigurationDWS extends ClickOnMultipleElementInDWS
{
@Test()
		public void clickelement() throws InterruptedException
		{
		String url="https://demowebshop.tricentis.com/news/rss/1";
		Actions A1=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,8000)");
	
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
		for(WebElement web:links)
		{
			String CurrentUrl=driver.getCurrentUrl();
			if(url.equals(CurrentUrl))
			{
				driver.navigate().back();
				Thread.sleep(2000);
			}
			web.click();
		   
	    }

    }
}
