package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWShomepage {
	
	public DWShomepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public @FindBy (xpath = "//img[@alt='Tricentis Demo Web Shop']")
	WebElement logo;
	
	public @FindBy (className ="ico-register")
	WebElement register;
	
	public @FindBy (className ="ico-login")
	WebElement login ;
	

	public @FindBy (className ="ico-cart")
	WebElement Shopping_cart ;
	
	public @FindBy (className ="cart-label")
	WebElement wishlist ;
	
	public @FindBy (linkText= "Books\r\n"
			+ "        ")
	WebElement books ;
	
	public @FindBy (linkText ="Computers\r\n"
			+ "        ")
	WebElement computers ;
	
	public @FindBy (linkText ="Electronics\r\n"
			+ "        ")
	WebElement electronics ;
	
	public @FindBy (linkText = "Apparel & Shoes\r\n" 
			+ "        ")
	WebElement appareal_and_shoes ;
	
	public @FindBy (linkText = "Digital downloads\r\n"
			+ "        ")
	WebElement digital_download ;
	
	public @FindBy (linkText = "Jewelry\r\n"
			+ "        ")
	WebElement jewelry ;
	
	public @FindBy (linkText = "Gift Cards\r\n"
			+ "        ")
	WebElement gift_cardas ;
	
	public @FindBy (linkText = "Newsletter")
	WebElement Newsletter ;
	
	public @FindBy (id="newsletter-email")
	WebElement newsletter ;
	
	public @FindBy (linkText ="Community poll")
	WebElement Community_poll ;

}
