/*
 * package com.orange.driver;
 * 
 * import org.openqa.selenium.WebDriver;
 * 
 * import com.totumrisk.config.utilities.Configuration; import
 * com.totumrisk.constants.Browsers;
 * 
 * public class DriverFactory { protected static DriverManager driverManager =
 * null; protected static Configuration config;
 * 
 * public DriverManager getManager() { config=new Configuration(); return
 * getBrowser(config.getBrowser());
 * 
 * }
 * 
 * public WebDriver getDriver() { return getManager().getDriver(); }
 * 
 * public void quitDriver() { getManager().quitDriver(); } private DriverManager
 * getBrowser(String Browser) { switch (Browser) { case Browsers.CHROME:
 * driverManager = new ChromeDriverManager(); break; case Browsers.FIREFOX:
 * driverManager = new FirefoxDriverManager(); break; case Browsers.EDGE:
 * driverManager = new EdgeDriverManager(); break; case Browsers.SAFARI:
 * driverManager = new SafariDriverManager(); break; case Browsers.OPERA:
 * driverManager = new OperaDriverManager(); break; default: // driverManager =
 * new SafariDriverManager(); break; } return driverManager; }
 * 
 * }
 * 
 */