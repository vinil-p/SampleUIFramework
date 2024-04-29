package com.cucumweb.driver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationDriver {
	public WebDriver driver;
	public WebDriverWait wait;

	public void browserLaunch() {
		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-http2");
			options.addArguments("--disable-notifications");
//options.addArguments("--disable-popup-blocking");
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			// options.setExperimentalOption("excludeSwitches", new String[]
			// {"disable-popup-blocking"});

			options.addArguments("--disable-web-security");
			options.addArguments("--allow-running-insecure-content");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void browserLaunch(String browser) {
		try {
			if (browser.equals("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("start-maximized");
				// options.addArguments("--disable-popup-blocking");
				options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
				 options.setExperimentalOption("excludeSwitches", new String[]
				{"disable-popup-blocking"});
				 Map<String, Object> prefs = new HashMap<String, Object>();
				 prefs.put("profile.default_content_setting_values.notifications", 1);
				 options.setExperimentalOption("prefs", prefs);
				options.setPageLoadStrategy(PageLoadStrategy.EAGER);
				driver = new ChromeDriver(options);
			} else if (browser.equals("edge")) {
				driver = new EdgeDriver();}
				else if (browser.equals("firefox")) {
					driver = new FirefoxDriver();
			}

			driver.manage().window().maximize();
			
			wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (driver != null) {
				driver.quit();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
