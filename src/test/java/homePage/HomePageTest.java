package homePage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {

	WebDriver driver;
	
	@Before
	public void beforeTest() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rozetka.com.ua");
	}
	
	@After
	public void afterTest() {
		driver.quit();
	}
	
	@Test
	public void checkComparePopUp() {
		
		
	}
}
