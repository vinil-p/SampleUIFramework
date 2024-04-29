package com.cucumweb.pages;

import static org.testng.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumweb.repo.Repository;

public class NewsAndFeaturePage extends Repository {
	WebDriver driver;
	WebDriverWait wait;

	public NewsAndFeaturePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
	}
	
	@FindBy(how = How.XPATH, using = "/html//div[@id='__next']/main/div[3]/div/div/div[2]//ul[@class='ContentGrid_contentGridArticles__Lk_4g']/li")
	private List<WebElement> videos;

	public void getAllVideosCount() {
		try {
			int size = getElementsSize(videos);
		
			System.out.println("total video's count " + size);
             if (size==0) {
				assertFalse(true, "no videolinks found");
			} 
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
