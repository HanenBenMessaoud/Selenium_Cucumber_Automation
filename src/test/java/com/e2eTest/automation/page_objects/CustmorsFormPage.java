package com.e2eTest.automation.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.utils.Setup;

public class CustmorsFormPage {
	/* Retrieve Element */

	@FindBy(how = How.XPATH, using = "//a[@href='#']//p[contains(text(),'Customers')]")
	public static WebElement customers;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customers']")
	public static WebElement customersIcon;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	public static WebElement addNewBtn;
	
	@FindBy(how = How.ID, using = "Email")
	public static WebElement email;
	
	@FindBy(how = How.ID, using = "Password")
	public static WebElement password;
	
	@FindBy(how = How.ID, using = "FirstName")
	public static WebElement firstName;
	
	@FindBy(how = How.ID, using = "LastName")
	public static WebElement lastName;
	
	@FindBy(how = How.ID, using = "Gender_Male")
	public static WebElement gender;
	
	//@FindBys(value = { className = "body.sidebar-mini.layout-fixed.control-sidebar-slide-open.sidebar-closed.sidebar-collapse:nth-child(2) div.k-animation-container:nth-child(17) div.k-calendar-container.k-popup.k-group.k-reset div.k-widget.k-calendar div.k-calendar-view > table.k-content.k-month" })
	//public static List<WebElement> dateOfBirth;
	
	@FindBy(how = How.ID, using = "Company")
	public static WebElement companyName;
	
	@FindBy(how = How.ID, using = "IsTaxExempt")
	public static WebElement isTaxExempt;
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-group-append']//div[@role='listbox']")
	public static WebElement newsletter;
	
	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Test store 2']")
	public static WebElement newsletterValue;
	
	@FindBy(how = How.ID, using = "SelectedCustomerRoleIds_label")
	public static WebElement customerRoles;
	
	@FindBy(how = How.ID, using = "//li[normalize-space()='Guests']")
	public static WebElement customerRolesValue;
	
	@FindBy(how = How.ID, using = "VendorId")
	public static WebElement managerOfVendor;
	
	@FindBy(how = How.ID, using = "AdminComment")
	public static WebElement adminComment;
	
	public CustmorsFormPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		
	}
	
}
