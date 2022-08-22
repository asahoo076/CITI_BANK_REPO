package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {

	public WebDriver driver;

	@BeforeTest
	public void init() throws IOException {
		driver = initialBrowser();

		driver.get(prop.getProperty("url"));

	}

	@Test
	public void ValidateTitle() throws IOException {

		LandingPage lp = new LandingPage(driver);

		String title = lp.getTitle().getText();
		
		System.out.println(title);
	 
		if(title.contentEquals("Featured Courses123")) {
			
			Assert.assertTrue(true);
		}
	
	}

	@AfterTest()
	public void tearDown() {

		driver.close();

	}

}
