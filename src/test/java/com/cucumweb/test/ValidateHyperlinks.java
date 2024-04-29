package com.cucumweb.test;

import static org.testng.Assert.assertEquals;

import com.cucumweb.driver.ConfigurationDriver;
import com.cucumweb.pages.BullsHomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateHyperlinks extends ConfigurationDriver {
	BullsHomePage bullsHomePage;

	@Given("launch NBA bulls {string} in {string} browser")
	public void launch_nba_bulls_in_browser(String url, String browser) {
		browserLaunch(browser);
		bullsHomePage = new BullsHomePage(driver, wait);
		driver.get(url);
	}

	@When("validate user is on homepage {string}.")
	public void validate_user_is_on_homepage(String title) {

		String page_title = driver.getTitle();
		assertEquals(page_title, title);

	}

	@Then("Get All footer hyperlinks")
	public void get_all_footer_hyperlinks() {
		bullsHomePage.getAllHyperlinks();
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
}
