package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {
	
	static final By  EMAIL_TEXTBOX_LOCATOR =By.id("email");
	
	static final By PASSWORD_TEXTBOX_LOCATOR =By.id("password");
	
	static final By  SUBMIT_LOGIN_LOCATOR =By.id("Submit Login");

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	public MyAccountPage doLoginWith(String emailId,String password) {
		enterText(EMAIL_TEXTBOX_LOCATOR, emailId);
		enterText(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(SUBMIT_LOGIN_LOCATOR);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
}}
