package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(css="#wishlist")
	public WebElement wishButton;
	
	@FindBy(css=".header-popup.header-popup-wishlist-empty.sprite-side")
	public WebElement wishPopUp;
	 
}
