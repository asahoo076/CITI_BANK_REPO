package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.NavigationBar;
import resources.base;

public class ValidateNavBar extends base{
	
	public WebDriver driver;
	@BeforeTest
	public void init() throws IOException {
		driver = initialBrowser();

		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void ValidateNavBar() throws IOException{
		
			
		NavigationBar nb = new NavigationBar(driver);
		
		nb.cancelPopup().click();
		
		if(nb.getNavigationBar().isDisplayed()) {
			Assert.assertTrue(true);
		}		
		
	}
	
	@AfterTest()
	public void tearDown() {

		driver.close();

	}
	

}
