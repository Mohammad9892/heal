package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public TorusLogin torusLogin;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public TorusLogin getTorusLogin()
	{
		torusLogin = new TorusLogin(driver);
		return torusLogin;
	}

}
