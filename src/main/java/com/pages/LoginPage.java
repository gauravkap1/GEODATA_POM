package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
WebDriver driver;
WebDriverWait wait;

@FindBy(xpath="(//a[@id='loginRegisterError'])[2]") WebElement logIn;
@FindBy(xpath="//input[@id='LoginModal_Email']") WebElement username;
@FindBy(xpath="//input[@id='LoginModal_Password']") WebElement password;
@FindBy(xpath="//button[@id='LoginModal_Submit']") WebElement submit;

public LoginPage() {
	PageFactory.initElements(driver, this);
}

public void navigateToGeoData() throws Throwable {
	
	 driver.navigate().to("https://899211-Rajinder.Kuma:EDyzuDG3B5GheCUm@core.geodataplus.com");
}
public void loginClick() {
	logIn.click();
}

//public void loginToBox(String uName, String pwd) throws Exception {
//	username.sendKeys(uName);
	
//	password.sendKeys(pwd);
//	submit.click();
//}

	
}
