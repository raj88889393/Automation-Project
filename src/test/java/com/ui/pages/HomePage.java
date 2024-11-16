package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {
	
	static final By SIGN_IN_TEXT_LOCATOR =By.xpath("//a[contains(text(),\"Sign in\")]");
	
	public HomePage(Browser browserName) {
		super(browserName);
		goToWebsite("http://www.automationpractice.pl/index.php");
		
	}
	
	public LoginPage goToLoginPage() {
		clickOn(SIGN_IN_TEXT_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}

	

}
