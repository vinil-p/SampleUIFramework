package com.cucumweb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumweb.repo.Repository;

public class HomePage extends Repository {
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CSS,using = ".flex-end div")
    private WebElement closepopUp;
	@FindBy(how = How.CSS, using = "[aria-label='header-secondary-menu'] span")
	private WebElement menu;
	@FindBy(how = How.CSS, using = "li[role='menuitem']  ul[role='menu'] > li:nth-of-type(2) > a[title='News & Features']")
	private WebElement featureOptions;

	public void redirect_To_VideosFeed() {
		try {
			click(closepopUp);
			mouseHover(menu, featureOptions);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
