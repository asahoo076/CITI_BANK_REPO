package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	//By initPopup = By.xpath("//div[@class='sumome-react-wysiwyg-popup-animation-group']");
	
	//By cancel = By.xpath("//button[contains(text(), 'NO THANKS')]");
	By login = By.linkText("Logi");
	By title = By.xpath("//div[@class='text-center']/h2");
	
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}

//	public WebElement getPopup() {
//		return driver.findElement(initPopup);
//	}
//	
//	public WebElement cancelPopup() {
//		return driver.findElement(cancel);
//	}

	public WebElement getLogin() {
		return driver.findElement(login);
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

}
