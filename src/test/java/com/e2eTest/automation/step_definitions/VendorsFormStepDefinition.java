package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.VendorFromPage;
import com.e2eTest.automation.utils.DateUtil;
import com.e2eTest.automation.utils.SelectFromListUtils;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VendorsFormStepDefinition {
	
	public VendorFromPage vendorFormPage;
	public SeleniumUtils seleniumUtils;
	public SelectFromListUtils selectFromListUtils;
	public Validations validations;
	public DateUtil dateUtil;
	
	@When("je clique sur Vendors")
	public void jeCliqueSurVendors() {
		System.out.println(VendorFromPage.addNewVendorBtn.getText());

	}
	@Then("l interface recherche vendors s affiche")
	public void lInterfaceRechercheVendorsSAffiche() {
	
	}
	@When("je clique sur add new")
	public void jeCliqueSurAddNew() {
	 
	}
	@Then("l interface add new vendor vendors s affiche")
	public void lInterfaceAddNewVendorVendorsSAffiche() {

	}
	@When("je remplis le champs name {string}")
	public void jeRemplisLeChampsName(String string) {
	
	}
	@When("je remplis le champs description {string}")
	public void jeRemplisLeChampsDescription(String string) {

	}
	@When("je clique sur le boutton save")
	public void jeCliqueSurLeBouttonSave() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("un nouveau vendeur s ajoute")
	public void unNouveauVendeurSAjoute() {
	   
	}


}
