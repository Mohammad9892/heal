package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TorusLogin {
	public WebDriver driver;
	
	public TorusLogin(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By signup = By.id("mobileButton");
	By mobilenumber = By.id("mobileNumber");
	By Mcontinue = By.id("loginContinew");
	By skip = By.xpath("//button[@type='button']");
    By otp = By.name("ion-input-0");
    By Sotp = By.id("submitOTP");
    By FName =  By.id("firstName");
    By MName = By.id("middleName");
    By LName = By.id("lastName");
    By EMail = By.id("emailId");
    By Pcontinue = By.xpath("//button[@type='submit']");
    By Empin = By.id("setMpin1");
    By Rempin = By.id("setMpin5");
    By Smpin = By.id("setMpin");
    By Mpin = By.id("mpin1");
    By Vmpin = By.id("verifyMpin");
    
    public void Signup()
    {
    	driver.findElement(signup).click();
    }
}
