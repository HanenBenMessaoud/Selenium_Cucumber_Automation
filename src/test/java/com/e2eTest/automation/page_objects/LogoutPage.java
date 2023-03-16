package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class LogoutPage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement btnLogout;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Admin area demo')]")
	public static WebElement titlePage1;
	
	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void clickOnBtnLogout() {
		btnLogout.click();
	}


}
