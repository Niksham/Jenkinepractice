package com.orange.constants;

import java.io.File;

import com.orange.configuration.utilities.*;

public class FilePaths {

	public static String timestamp1 = Timestamp.getDayTime();
	
	public static final String USER_DIR = System.getProperty("user.dir");
	
	public static final String CONFIG_PROPERTIES = USER_DIR + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "Config.properties";
	
	public static final String LOG_PROPERTIES = USER_DIR + File.separator + "src" + File.separator + "main"
			+ File.separator + "resources" + File.separator + "log4j.properties";
	
	public static String TESTDATA_FILE = USER_DIR + File.separator + "src" + File.separator + "test" + File.separator
			+ "resources" + File.separator + "TestData" + File.separator;
	
	public static String EXTENT_CONFIG = USER_DIR + File.separator + "src" + File.separator + "main" + File.separator
			+ "resources" + File.separator + "extent-config.xml";
	
	public static String SCREENSHORT_DIR = "./Report/TifinReport" + timestamp1 + "/Screenshots/";
	
	public static String REPORT_DIR = "./Report/" ;
	
	public static String REPORT_CONFIG = "./Report//TifinReport"+timestamp1+".html";
	
	public static String ATTACHSCREENSHOT_DIR = "../TifinReport"+timestamp1+"/Screenshots/";
	
	public static String USERLOGIN_PROPERTIES = USER_DIR + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "user.properties";
	
	public static String CVRCompliance_PROPERTIES = USER_DIR + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "CvrCompliance.properties";

}
