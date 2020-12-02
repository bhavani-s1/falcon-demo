package com.atmecs.falcon_testing_excel.falcon_excel_demo.pages;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.constant.FilePathConstants;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.reader.PropReader;

public class HomePage extends BasePage {

		private ReportLogService report = new ReportLogServiceImpl(HomePage.class);
		PropReader homeProps=new PropReader(FilePathConstants.HOME_PROPS_FILEPATH);

		public HomePage(Browser browser) {
		super (browser);

		}
		public void ClickLoginLink() {
		report.info("Click on login link");
		browser.getFindFromBrowser().findElementByXpath(homeProps.get("login_link")).click();
		}
		
		public void handleAdvancedButton() {
			report.info("Click on login Button");
			browser.getFindFromBrowser().findElementByXpath(homeProps.get("login_button")).click();
			
			
		}
		public void navigateToUrl(String appUrl, String os, String osVersion, String br, String browserVersion) {
		// TODO Auto-generated method stub

		}
	
	
	
}
