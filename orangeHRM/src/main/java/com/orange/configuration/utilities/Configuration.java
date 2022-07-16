/*
 * package com.orange.configuration.utilities;
 * 
 * import java.util.Properties;
 * 
 * import org.apache.log4j.PropertyConfigurator;
 * 
 * import com.orange.constants.*;
 * 
 * public class Configuration { private String browser; private static String
 * url; private String username; private String password; private Boolean
 * incognito; private Boolean headless; private static Properties pro;
 * 
 * public Configuration() {
 * PropertyConfigurator.configure(FilePaths.LOG_PROPERTIES); pro =
 * PropertyReader.readApplicationFile(FilePaths.CONFIG_PROPERTIES);
 * 
 * }
 * 
 * public Configuration(String filepath) {
 * PropertyConfigurator.configure(FilePaths.LOG_PROPERTIES); pro =
 * PropertyReader.readApplicationFile(filepath);
 * 
 * }
 * 
 * 
 * public String getBrowser() {
 * browser=pro.getProperty(ConfigProperties.BROWSER); return browser;
 * 
 * }
 * 
 * public Boolean isHeadlessmode() { String
 * headlessmode=pro.getProperty(ConfigProperties.HEADLESS);
 * headless=Boolean.valueOf(headlessmode); return headless;
 * 
 * }
 * 
 * public String getUrl() { if( getDefaultEnv().equals("dev")) { url =
 * getDevEnv(); return url; } else if(getDefaultEnv().equals("prod")){ url =
 * getProdEnv(); return url; } return url; }
 * 
 * public String getUsername() {
 * 
 * username= pro.getProperty(ConfigProperties.USERNAME); return username; }
 * 
 * public String getPassword() {
 * 
 * password=pro.getProperty(ConfigProperties.PASSWORD); return password; }
 * 
 * public Boolean getIncognito() { String
 * incognitoMode=pro.getProperty(ConfigProperties.INCOGNITO);
 * incognito=Boolean.valueOf(incognitoMode); return incognito; }
 * 
 * public String getDevEnv() { return pro.getProperty(ConfigProperties.DEV_URL);
 * }
 * 
 * public String getProdEnv() { return
 * pro.getProperty(ConfigProperties.PROD_URL); }
 * 
 * 
 * public String getDefaultEnv() { return pro.getProperty(ConfigProperties.ENV);
 * }
 * 
 * 
 * public String getLoginCredentials(String user) { return
 * pro.getProperty(user);
 * 
 * }
 * 
 * public String getDataFromPropFile(String data) { return
 * pro.getProperty(data); }
 * 
 * }
 */