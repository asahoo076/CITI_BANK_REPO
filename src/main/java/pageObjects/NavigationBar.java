package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar {
	
	public WebDriver driver;
	
	By cancel = By.xpath("//button[contains(text(), 'NO THANKS')]");
	By navBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	
	public NavigationBar(WebDriver driver) {
		
		this.driver=driver;
	}

	
	public WebElement cancelPopup() {
		return driver.findElement(cancel);
	}

	public WebElement getNavigationBar() {
		return driver.findElement(navBar);
	}

}
