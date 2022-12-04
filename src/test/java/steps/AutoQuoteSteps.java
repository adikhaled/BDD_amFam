package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import reporting.Logs;

public class AutoQuoteSteps extends BaseClass{
	
	@Given("user navigate to homePage")
	public void user_navigate_to_home_page() {
	   Logs.log("user is on the home page");
	}

	@When("user click start new quote")
	public void user_click_start_new_quote() {
	    homePage.homePageSteps();
	}

	@When("user input zipcode")
	public void user_input_zipcode() {
	    letsGoStarted.zipCodeStep();
	}

	@When("user click car insurance option")
	public void user_click_car_insurance_option() {
	   letsGoStarted.carStep();
	}

	@When("user click lets go button")
	public void user_click_lets_go_button() {
	    letsGoStarted.letsGoStep();
	}
	@When("user click on get a quote button")
	public void user_click_on_get_a_quote_button() throws InterruptedException {
	    getAQuotePage.getAQuoteButtonStep();
	}
}
