/*
 * package com.orange.waits;
 * 
 * import org.apache.log4j.Logger; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Hold { private static WebDriverWait wait; private static Logger
 * logger=Logger.getLogger(PageProcessing.class);
 * 
 * public static void foundElement(WebDriver ldriver, WebElement targetElement)
 * { wait =new WebDriverWait(ldriver, WaitTime.waitElement);
 * logger.info("Hold till element is visible for"+ WaitTime.waitElement+"sec");
 * wait.until(ExpectedConditions.visibilityOf(targetElement)); }
 * 
 * public static void tillClickable(WebDriver ldriver, WebElement targetElement)
 * { wait =new WebDriverWait(ldriver, WaitTime.waitElement);
 * logger.info("Hold till element is clickabale for"+
 * WaitTime.waitElement+"sec");
 * wait.until(ExpectedConditions.elementToBeClickable(targetElement)); } public
 * static void explictWait() { try { Thread.sleep(4000); } catch
 * (InterruptedException e) { logger.info("Exception While explicit wait");
 * e.printStackTrace(); } } }
 */