package com.atmecs.falcon_testing_excel.falcon_excel_demo.constant;

import java.io.File;

public class FilePathConstants {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "main" + File.separator
			+ "resources" + File.separator;

	public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
	public final static String ATMECS_HOME = LOCATOR_HOME + "atmecs" + File.separator;

	public final static String LIB_HOME = USER_HOME + "lib" + File.separator;

	public final static String HOME_LOCATOR_PATH = ATMECS_HOME
			+ "HomeAtmecsIncDigitalSolutionsProductEngineeringServices.properties";
	
	
	public static final String LOGIN_DATA_XLSX_FILEPATH = "./src/main/resources/locators/atmecs/blazecontact.xlsx";

	public static final String HOME_PROPS_FILEPATH = "./src/main/resources/locators/atmecs/HomePage.properties";

	public static final String LOGIN_PROPS_FILEPATH = "./src/main/resources/locators/atmecs/Login.properties";
	

}
