package com.cucumweb.repo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumweb.driver.ConfigurationDriver;

public class Repository extends ConfigurationDriver {
	public Repository(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void click(WebElement target1) {
		try {
			wait.until(ExpectedConditions.visibilityOf(target1));
			target1.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void send(WebElement target1,String data) {
		try {
			wait.until(ExpectedConditions.visibilityOf(target1));
			target1.sendKeys(data);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getElementsSize(List<WebElement> target1) {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(target1));
			return target1.size();
		} catch (Exception e) {
			return 0;
		}
	}

	public void mouseHover(WebElement target1, WebElement tagrget2) {
		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(target1).moveToElement(tagrget2).click().build().perform();
		} catch (Exception e) {
			assertFalse(false," element not found");
		}

	}
	public void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
