package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserEpicPage;
import utils.TestContextSetup;

public class EpicStepDefinition {
	UserEpicPage userEpicPage;
	TestContextSetup testContextSetup;

	public EpicStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.userEpicPage = testContextSetup.pageObjectManager.getUserEpicPage();

	}

	@Given("User is on landing page")
	public void user_is_on_landing_page() throws IOException, InterruptedException {
		//userEpicPage.NewTab();
		userEpicPage.ClsPop();
		userEpicPage.LoginLanding();
		userEpicPage.EmailInput();
	}

	@When("User jokes around")
	public void user_jokes_around() throws InterruptedException {
		userEpicPage.Joke();
		userEpicPage.Show();
	}

	@And("User arranges filters and choses which shirt to buy")
	public void user_arranges_filters_and_choses_which_shirt_to_buy() throws InterruptedException {
		userEpicPage.Gomlek();
		userEpicPage.Filter();
		userEpicPage.ShirtSpecs();
	}

	@When("^User adds Lich King to cart$")
	public void user_adds_lich_king_to_cart() throws InterruptedException {
		userEpicPage.LichKing();
	}



	@Then("^User empty cart and log out$")
	public void user_empty_cart_and_log_out(){
		userEpicPage.EmptyCart();
		userEpicPage.LogOut();
	}

	

}


