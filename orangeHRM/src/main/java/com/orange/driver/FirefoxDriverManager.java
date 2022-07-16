/*
 * package com.orange.driver;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.firefox.FirefoxOptions;
 * 
 * import com.totumrisk.config.utilities.Configuration;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager; import
 * io.github.bonigarcia.wdm.config.DriverManagerType;
 * 
 * public class FirefoxDriverManager extends DriverManager { static
 * Configuration config;
 * 
 * @Override protected WebDriver createDriver() {
 * WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup(); return new
 * FirefoxDriver(getFirefoxOptions()); }
 * 
 * public FirefoxOptions getFirefoxOptions() { config = new Configuration();
 * FirefoxOptions options= new FirefoxOptions();
 * 
 * if (config.getIncognito()) {
 * 
 * options.addArguments("private");
 * 
 * }
 * 
 * if (config.isHeadlessmode()) { options.addArguments("headless"); }
 * 
 * options.addArguments("start-maximized");
 * 
 * return options; }
 * 
 * }
 */