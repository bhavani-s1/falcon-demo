package com.atmecs.falcon_testing_excel.falcon_excel_demo.pages;


import com.atmecs.falcon_testing_excel.falcon_excel_demo.constant.FilePathConstants;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.reader.PropReader;
import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService; 
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;

public class LoginPage extends BasePage {

	private ReportLogService report = new ReportLogServiceImpl(LoginPage.class); 	
	PropReader loginProps=new PropReader(FilePathConstants.LOGIN_PROPS_FILEPATH);
	
	public LoginPage(Browser browser) {
		super(browser);
	

		}

		public void login (String username,String password) {
		report.info(" Enter username");
		
		
		browser.getTextField().enterTextField(LocatorType.XPATH,loginProps.get("username_input"),username);
		//browser.getTextField().enterTextField(LocatorType.XPATH,loginProps.get("username_input"),username);


		report.info(" Enter Password");
		browser.getTextField().enterTextField(LocatorType.XPATH,loginProps.get("Password_input"),password);
		//browser.getTextField().enterTextField(LocatorType.XPATH,loginProps.get("Password_input"),password);

		report.info("Click login button");
		browser.getFindFromBrowser().findElementByXpath(loginProps.get("login_button")).click();
		//browser.getFindFromBrowser().findElementByXPATH(loginProps.get("login_button")).click();

		}

		private static Object get(String string) {
		// TODO Auto-generated method stub
		return null;
		}

		public void navigateToUrl(String appUrl, String os, String osVersion, String br, String browserVersion) {
			// TODO Auto-generated method stub
			
		}


		}
	
	

