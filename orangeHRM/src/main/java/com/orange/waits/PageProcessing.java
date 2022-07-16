/*
 * package com.orange.waits;
 * 
 * import org.apache.log4j.Logger; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class PageProcessing { private static final By loader =
 * By.className("WaitTime.java"); private static final By progressBar =
 * By.xpath("//html[@class='nprogress-busy']"); private static final By popup =
 * By.className("ant-notification-notice-content"); private static WebDriverWait
 * wait = null; private static Logger logger =
 * Logger.getLogger(PageProcessing.class);
 * 
 * public static void actionCompletion(WebDriver ldriver) { try { wait = new
 * WebDriverWait(ldriver, WaitTime.pageLoading);
 * logger.info("Loading page, wait for " + WaitTime.pageLoading + "sec");
 * wait.until(ExpectedConditions.invisibilityOfElementLocated(progressBar)); }
 * catch (Exception e) { e.printStackTrace(); } }
 * 
 * public static void pageLoading(WebDriver ldriver) { try { wait = new
 * WebDriverWait(ldriver, WaitTime.pageLoading);
 * logger.info("Loading page, wait for " + WaitTime.pageLoading + "sec");
 * wait.until(ExpectedConditions.invisibilityOfElementLocated(loader)); } catch
 * (Exception e) { e.printStackTrace(); } }
 * 
 * public static void messagePopupLoading(WebDriver ldriver) { try { wait = new
 * WebDriverWait(ldriver, WaitTime.popupLoading);
 * logger.info("Loading popup, wait for " + WaitTime.popupLoading + "sec");
 * wait.until(ExpectedConditions.visibilityOfElementLocated(popup)); } catch
 * (Exception e) { e.printStackTrace(); } }
 * 
 * public static void alertPopupLoading(WebDriver ldriver) { try { wait = new
 * WebDriverWait(ldriver, WaitTime.popupLoading);
 * logger.info("Loading popup, wait for " + WaitTime.popupLoading + "sec");
 * wait.until(ExpectedConditions.visibilityOfElementLocated(popup)); } catch
 * (Exception e) { e.printStackTrace(); } }
 * 
 * public static void errorPopupLoading(WebDriver ldriver) { try { wait = new
 * WebDriverWait(ldriver, WaitTime.popupLoading);
 * logger.info("Loading popup, wait for " + WaitTime.popupLoading + "sec");
 * wait.until(ExpectedConditions.visibilityOfElementLocated(popup)); } catch
 * (Exception e) { e.printStackTrace(); } } }
 */