package BDD_Framework.Dsalgo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;


public class StepDefinitions {
	
	//TestContext testContext;
	// Below definition is a Object reference or datatype for the Class StepsDefinition
	WebDriver driver;
	Homepage homePage;
	WebDriverManager webDriverManager;
	PageObjectManager pageObjectManager;
	
	/*public StepDefinitions(TestContext context) {
		//testContext = context;
		
		homePage = testContext.getPageObjectManager().getHomePage();
	}*/

    @Given("The user opens DS Algo portal link")
    public void openDsAlgoportal() {
    	webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		//java concept any construtor created in class needs to be passed as param while creating the object of the class
		pageObjectManager = new PageObjectManager(driver); 
		homePage = pageObjectManager.getHomePage();
		//testContext = context;
    	homePage.navigateTo_HomePage();
    	
    }
   
    @Then("The user should land in DS Algo portal page")
    public void LandingonDsAlgoportal() {
    }

    @When("The user clicks the \"Get Started\" button")
    public void ClickingGetStartedButton() {
    	homePage.clickGetStarted();
    }
    @Then("The user should be redirected to homepage")
    public void OpenHomePage() {
    	
    }
}

