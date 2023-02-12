package utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String TorusLogin;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	
	public TestContextSetup()
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
	}

}
