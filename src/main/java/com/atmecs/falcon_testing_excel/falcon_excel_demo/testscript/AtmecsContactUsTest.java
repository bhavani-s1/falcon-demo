package com.atmecs.falcon_testing_excel.falcon_excel_demo.testscript;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.TextField;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.constant.FilePathConstants;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.constant.LocatorKeyContainer;
import com.atmecs.falcon_testing_excel.falcon_excel_demo.testsuite.SampleTestSuiteBase;
import com.atmecs.locatorSmartFixTool.models.SmartFixPageFileHandler;

public class AtmecsContactUsTest extends SampleTestSuiteBase {
	private ReportLogService report = new ReportLogServiceImpl(AtmecsContactUsTest.class);
	
	//String url = "http://www.atmecs.com/";
	
	String url = "https://demoblaze.com/";
	
	@Test
	@Parameters({"os", "osVersion", "browser", "browserVersion"})
	public void contactUsTest(String os, String osVersion, String br, String browserVersion) {
		browser.openURL(url, os, osVersion, br, browserVersion);
		browser.maximizeWindow();
		
		Click click = browser.getClick();
		report.info("executing exploreTest ");
		click.waitandclick(LocatorType.XPATH,
				SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.CONTACT_US_LINK),
				3000);
		TextField enterText = browser.getTextField();
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_1),  "Maximillian");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_2),  "max@gmail.com");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_3),  "9789549405");
		enterText.enterTextField(LocatorType.XPATH,SmartFixPageFileHandler.getLocatorValue(FilePathConstants.HOME_LOCATOR_PATH, LocatorKeyContainer.INPUT_4),  "Max insurance");
		
	}
	
}
