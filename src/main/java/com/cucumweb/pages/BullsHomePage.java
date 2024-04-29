package com.cucumweb.pages;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumweb.repo.Repository;

public class BullsHomePage extends Repository {
	WebDriver driver;
	WebDriverWait wait;

	public BullsHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = ".//button[text()='I Accept']")
	private WebElement acceptAlert;
	By categoryhyperlinks = By.xpath(".//footer/div[2]/div[1]/nav");

	public void acceptPrivacyPopUp() {
		try {
			click(acceptAlert);
			scrollToBottom();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getAllHyperlinks() {
		try {
			Map<String, Integer>map=new HashMap<String, Integer>();
			List<WebElement> vc = driver.findElements(categoryhyperlinks);
			int totalCategories = getElementsSize(vc);
			FileWriter csvWriter = new FileWriter("./hyperlinksData.csv");
			for (int i = 1; i < totalCategories; i++) {
				List<WebElement> links = vc.get(i).findElements(By.xpath(".//ul/li/a"));
				for (int j = 0; j < links.size(); j++) {
					String clinks = links.get(j).getAttribute("href");
					System.out.println(clinks);
					csvWriter.append(clinks).append("\n");
					if (map.containsKey(clinks)) {
						map.put(clinks, map.get(clinks)+1);
					}
					else {
						map.put(clinks, 1);
					}
				}

			}
			csvWriter.close();
			System.out.println(map);
			map.entrySet().stream().forEach(e->{
				if (map.get(e.getKey())>1) {
					System.out.println("duplicate url found "+e.getKey());
				}
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
