/*
 * package com.orange.driver;
 * 
 * import org.apache.log4j.Logger; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions;
 * 
 * import com.totumrisk.config.utilities.Configuration;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager; import
 * io.github.bonigarcia.wdm.config.DriverManagerType;
 * 
 * public class ChromeDriverManager extends DriverManager { private static
 * Configuration config; private static Logger
 * logger=Logger.getLogger(ChromeDriverManager.class);
 * 
 * @Override protected WebDriver createDriver() {
 * WebDriverManager.getInstance(DriverManagerType.CHROME).setup(); return new
 * ChromeDriver(getChromeOption()); }
 * 
 * public ChromeOptions getChromeOption() { config = new Configuration();
 * ChromeOptions options = new ChromeOptions();
 * 
 * if (config.getIncognito()) { options.addArguments("incognito");
 * logger.info("Set Chrome Browser to INCOGNITO mode");
 * 
 * }
 * 
 * if (config.isHeadlessmode()) { options.addArguments("headless");
 * logger.info("Run Chrome Browser in HEADLESS mode"); }
 * 
 * options.addArguments("start-maximized");
 * options.setExperimentalOption("excludeSwitches", new
 * String[]{"enable-automation"});
 * 
 * 
 * 
 * return options; }
 * 
 * }
 */