package academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateHomePage extends base{
	
	public WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void init() throws IOException {
		driver = initialBrowser();

		driver.get(prop.getProperty("url"));
	}

	
	@Test (dataProvider ="getData")
	public void ValidateHomePage(String username, String pwd) throws IOException {
		
		LandingPage lp = new LandingPage(driver);
//		wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(lp.getPopup()));
//		lp.cancelPopup().click();
		lp.getLogin().click();
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.getEmail().sendKeys(username);
		loginpage.getPassword().sendKeys(pwd);
		loginpage.getSubmit().click();
	}
	
	
	@AfterTest()
	public void tearDown() {

		driver.close();

	}
	
	@DataProvider
	 public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = "xyz@gmail.com";
		data[0][1]="12345";
		
//		data[1][0] = "abc@gmail.com";
//		data[1][1] = "24567";
				
		return data;
	}

}
