package com.atmecs.falcon_testing_excel.falcon_excel_demo.reader;



	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class PropReader {
	Properties Props;

	public  PropReader(String filePath) {



	Props= new Properties();

	try {
	Props.load(new FileInputStream (filePath));
	}catch (FileNotFoundException e ) {
	e.printStackTrace();
	}catch (IOException e) {
	e.printStackTrace();

	}
	}
	public String get(String Key) {
	return Props .getProperty(Key);
	}
	}
	
	
	
