package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	public LoginStepDefinition() {
		loginPage = new LoginPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
	}

	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {
		loginPage.goToUrl();
	}

	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		//loginPage.fillEmail(email);
		seleniumUtils.writeText(LoginPage.email, email);
		
	}

	@And("Je saisis le Password {string}")
	public void jeSaisisLePassword(String password) {
		//loginPage.fillPassword(password);
		seleniumUtils.writeText(LoginPage.password, password);
	}

	@And("Je clique sur le bouton LOGIN")
	public void jeCliqueSurLeBoutonLOGIN() {
		loginPage.clickOnBtnLogin();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String title) {
		String title_page = LoginPage.titlePage.getText();
		Assert.assertEquals(title_page, title);
	}

}
