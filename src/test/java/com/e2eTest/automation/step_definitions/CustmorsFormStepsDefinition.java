package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CustmorsFormPage;
import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.DateUtil;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustmorsFormStepsDefinition {
	public CustmorsFormPage custmorsFormPage;
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;
	public Validations validations;
	public DateUtil dateUtil;
	
	public CustmorsFormStepsDefinition() {
		custmorsFormPage = new CustmorsFormPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		dateUtil = new DateUtil();
		selectFromListUtils = new SelectFromListUtils();
		
	}
	
	@When("je clique sur Custmors")
	public void jeCliqueSurCustmors() {
		seleniumUtils.click(CustmorsFormPage.customers);

	}
	@Then("la sous liste Custmors s affiche")
	public void laSousListeCustmorsSAffiche() {
		
	}
	@When("je clique sur Icon Custmors")
	public void jeCliqueSurIconCustmors() {
		seleniumUtils.click(CustmorsFormPage.customersIcon);

	}
	@And("je clique sur le boutton Add New")
	public void jeCliqueSurLeBouttonAddNew() {
		seleniumUtils.click(CustmorsFormPage.addNewBtn);

	}
	@Then("un formulaire pour ajouter un client s affiche")
	public void unFormulairePourAjouterUnClientSAffiche() {

	}
	@When("je remplis les champs obligatoires du formulaire")
	public void jeRemplisLesChampsObligatoiresDuFormulaire() {
		
		seleniumUtils.writeText(CustmorsFormPage.email, "john.doe@gmail.com");
		seleniumUtils.writeText(CustmorsFormPage.password, "123456");
		seleniumUtils.writeText(CustmorsFormPage.firstName, "John");
		seleniumUtils.writeText(CustmorsFormPage.lastName, "Doe");
		// choose gender
		seleniumUtils.click(CustmorsFormPage.gender);
		//choose time
		//dateUtil.clickGivenDay(CustmorsFormPage.dateOfBirth, null);
		
		seleniumUtils.writeText(CustmorsFormPage.companyName, "virtualSARLé");
		seleniumUtils.click(CustmorsFormPage.isTaxExempt);
		//news letter
		seleniumUtils.click(CustmorsFormPage.newsletter);
		seleniumUtils.click(CustmorsFormPage.newsletterValue);
		// custmor roles
		seleniumUtils.click(CustmorsFormPage.customerRoles);
		seleniumUtils.click(CustmorsFormPage.customerRolesValue);
		//manage vendor 
		seleniumUtils.click(CustmorsFormPage.managerOfVendor);
		selectFromListUtils.selectDropDownListByIndex(CustmorsFormPage.managerOfVendor, 0);;
		//adminComment
		seleniumUtils.writeText(CustmorsFormPage.adminComment, "nothing to report");
		//click on save
		seleniumUtils.click(null);
		
		
		
		


		

	}
	@When("je clique sur save")
	public void jeCliqueSurSave() {

	}
	@Then("un nouveau client s ajoute")
	public void unNouveauClientSAjoute() {

	}
	@Then("un message s affiche The new customer has been added successfully.")
	public void unMessageSAfficheTheNewCustomerHasBeenAddedSuccessfully() {

	}


}
