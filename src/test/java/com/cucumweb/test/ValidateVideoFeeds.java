package com.cucumweb.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cucumweb.driver.ConfigurationDriver;
import com.cucumweb.pages.BullsHomePage;
import com.cucumweb.pages.HomePage;
import com.cucumweb.pages.NewsAndFeaturePage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidateVideoFeeds extends ConfigurationDriver {
	HomePage page;
	NewsAndFeaturePage newsAndFeaturePage;

	
	@Given("launch warriors {string} in {string} browser")
	public void launch_warriors_in_browser(String url, String browser) {
	    // Write code here that turns the phrase above into concrete actions
		browserLaunch(browser);
		page = new HomePage(driver, wait);
		newsAndFeaturePage = new NewsAndFeaturePage (driver, wait);
		driver.get(url);
	    	}
	  
	  @When("user in on the homePage") public void user_in_on_the_home_page()
	  throws InterruptedException { Thread.sleep(8000); String title =
	  driver.getTitle(); System.out.println("page title" + title);
	  
	  }
	  
	  @When("click on New& Features from menu") public void
	  click_on_new_features_from_menu() { page.redirect_To_VideosFeed(); }
	  
	  @Then("Get the Count Of Video Feeds") public void
	  get_the_count_of_video_feeds() { newsAndFeaturePage.getAllVideosCount();
	  
	  }
	  
	  @Then("Count the Video feeds which are more than3 days") public void
	  count_the_video_feeds_which_are_more_than3_days() { 
		  // Write code here that	  turns the phrase above into concrete actions 
		  throw new  io.cucumber.java.PendingException(); }
	 

}
