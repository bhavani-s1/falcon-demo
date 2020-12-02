package com.atmecs.falcon_testing_excel.falcon_excel_demo.testscript;

import com.atmecs.falcon_testing_excel.falcon_excel_demo.pages.HomePage;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.pages.LoginDataProvider;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.falcon_testing_excel.falcon_excel_demo.pages.HTUser;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.pages.LoginDataProvider;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.testscript.SampleTestSuiteBase;
import com.atmecs.falcon.automation.util.parser.PropertyParser;

public class LoginTest extends SampleTestSuiteBase {

String appUrl = PropertyParser.readEnvOrConfigProperty("appUrl");
	
	@BeforeMethod
	@Parameters({"os", "osVersion", "browser", "browserVersion"})
	public void initBrowser(String os, String osVersion, String br, String browserVersion) {
		this.os = os;
		this.osVersion = osVersion;
		this.br = br;
		this.browserVersion = browserVersion;
	}
	
	@Test (dataProvider = "logindata", dataProviderClass = LoginDataProvider.class)
	public void testLogin (String username, String password) {
		
		System.out.println("username:" +username + ",  password: " +password);
		
		HomePage homePage = new HomePage(browser);
		LoginPage loginPage = new LoginPage(browser);
		
		homePage.navigateToUrl(appUrl, os, osVersion, br, browserVersion);
		homePage.ClickLoginLink();
		//homePage.handleAdvancedButton();
		loginPage.login(username, password);
		
		
		
		//sample
		
		 
		 
		
		
	}

}