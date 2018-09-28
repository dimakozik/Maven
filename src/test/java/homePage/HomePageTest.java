package homePage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;

public class HomePageTest {

	WebDriver driver;

	@Before
	public void beforeTest() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rozetka.com.ua");
	}

	@After
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void checkWishPopUpIsShown() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.wishButton.click();

		WebDriverWait wait = new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.visibilityOf(homePage.wishPopUp));

		Assert.assertTrue("Wish PopUp is not shown", homePage.wishPopUp.isDisplayed());

	}

}
