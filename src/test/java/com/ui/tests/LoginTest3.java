package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.constants.Browser.*;

import com.constants.Browser;
import com.ui.pages.HomePage;

public class LoginTest3 {

	public static void main(String[] args) {
	
		HomePage homePage = new HomePage(CHROME);
		String userName = homePage.goToLoginPage().doLoginWith("rajendra95patil22@gmail.com", "password").getUserName();
		System.out.println(userName);
		}
	}


