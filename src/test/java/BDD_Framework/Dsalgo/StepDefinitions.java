package BDD_Framework.Dsalgo;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;


public class StepDefinitions {
	
	WebDriver driver;
	TestContext testContext;
	Homepage homePage;
	PageObjectManager pageObjectManager;	
	WebDriverManager webDriverManager;


    @Given("The user opens DS Algo portal link")
    public void openDsAlgoportal() {
    	webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
    	homePage.navigateTo_HomePage();
    }


    @Then("The user should land in DS Algo portal page")
    public void LandingonDsAlgoportal() {
    	driver.quit();
    }

    @When("The user clicks the \"Get Started\" button")
    public void ClickingGetStartedButton() {
    	
    }
    
}

