package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.page_objects.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {
	
	public LogoutPage logoutPage;
	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
	}
	
	@Given("Je suis connecte sur l application nopcommerce")
	public void jeSuisConnecteSurLApplicationNopcommerce() {
	    
	}
	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		logoutPage.clickOnBtnLogout();
	}
	@Then("Je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String title) {
		String title_page1 = LogoutPage.titlePage1.getText();
		Assert.assertEquals(title_page1, title);
	}


}
