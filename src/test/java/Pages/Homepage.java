package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

}
