/*
 * package com.orange.driver;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.apache.log4j.Logger; import org.openqa.selenium.WebDriver;
 * 
 * import com.totumrisk.manualwaits.WaitTime;
 * 
 * public abstract class DriverManager {
 * 
 * protected ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
 * private static Logger logger = Logger.getLogger(DriverManager.class);
 * protected abstract WebDriver createDriver();
 * 
 * public void quitDriver() {
 * 
 * if (null != drivers.get()) { try { drivers.get().quit(); drivers.remove();
 * logger.info("Dump driver"); } catch (Exception e) {
 * logger.debug("Failed to dump" + e); }
 * 
 * } }
 * 
 * public WebDriver getDriver() {
 * 
 * if (null == drivers.get()) { try { drivers.set(this.createDriver());
 * drivers.get().manage().timeouts().implicitlyWait(WaitTime.pageLoading,
 * TimeUnit.SECONDS); logger.info("Driver is created"); } catch (Exception e) {
 * logger.debug("Filed to intialize driver=>" + e); } } return drivers.get(); }
 * }
 */