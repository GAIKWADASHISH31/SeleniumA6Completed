package Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DWSBaseListeners;

@Listeners(Com.Crm.Listeners1.Basic.class)

	public class TestCaseBasicFailure extends DWSBaseListeners {
	@Test
	public void main1() throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com/";			
     	Thread.sleep(2000);	
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url,actual_Url);
		
	}
	@Test
	public void main2() throws InterruptedException {
		String expected_Url="https://demowebshop.tricentis.com";
	
		Thread.sleep(2000);	
		String actual_Url=driver.getCurrentUrl();
		assertEquals(expected_Url,actual_Url);
		}
	
}