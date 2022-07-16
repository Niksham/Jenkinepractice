/*
 * package com.orange.driver;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import
 * org.openqa.selenium.edge.EdgeOptions;
 * 
 * import com.totumrisk.config.utilities.Configuration;
 * 
 * import io.github.bonigarcia.wdm.WebDriverManager; import
 * io.github.bonigarcia.wdm.config.DriverManagerType;
 * 
 * public class EdgeDriverManager extends DriverManager { static Configuration
 * config;
 * 
 * @Override protected WebDriver createDriver() {
 * WebDriverManager.getInstance(DriverManagerType.EDGE).setup(); return new
 * EdgeDriver(); }
 * 
 * public EdgeOptions getEdgeOptions() { config = new Configuration();
 * EdgeOptions options= new EdgeOptions();
 * 
 * 
 * if (config.getIncognito()) {
 * 
 * options.addArguments("incognito");
 * 
 * }
 * 
 * if (config.isHeadlessmode()) { options.addArguments("headless"); }
 * 
 * options.addArguments("start-maximized");
 * 
 * 
 * return options; }
 * 
 * }
 */