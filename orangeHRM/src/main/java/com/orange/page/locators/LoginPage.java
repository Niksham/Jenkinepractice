/*
 * package com.orange.page.locators;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.FindAll; import
 * org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import lombok.Getter;
 * 
 * @Getter public class LoginPage {
 * 
 * public static WebDriver ldriver;
 * 
 * @FindAll({@FindBy(xpath="//input[@id='txtUsername']")}) private WebElement
 * userName;
 * 
 * @FindAll({@FindBy(xpath = "//input[@id='txtPassword']")}) private WebElement
 * userPassword;
 * 
 * @FindAll({@FindBy(xpath = "//input[@id='btnLogin")}) private WebElement
 * loginBtn;
 * 
 * @FindAll({@FindBy(xpath = "//span[@id='spanMessage']")}) private WebElement
 * nameValidMsg;
 * 
 * @FindAll({@FindBy(xpath="//span[@id='spanMessage']")}) private WebElement
 * pwdValidMsg;
 * 
 * public LoginPage(WebDriver driver) { ldriver = driver;
 * PageFactory.initElements(ldriver, this); }
 * 
 * 
 * 
 * 
 * }
 */