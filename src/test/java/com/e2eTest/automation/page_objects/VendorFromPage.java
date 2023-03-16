package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class VendorFromPage {
	
	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement customers;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Vendors')]")
	public static WebElement vendorBtn;
	
	@FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/div[1]/div[1]/a[1]")
	public static WebElement addNewVendorBtn;
	
	@FindBy(how = How.ID, using = "Name")
	public static WebElement vendorName;

	@FindBy(how = How.ID, using = "tinymce")
	public static WebElement vendorDescription;
		
	@FindBy(how = How.XPATH, using = "//iframe[@id='Description_ifr']")
	public static WebElement vendorEmail;
	
	public VendorFromPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}

}
