package BDD_Framework.Dsalgo;

import Pages.Homepage;
import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
	
	TestContext testContext;
	Homepage homePage;
	
	public StepDefinitions(TestContext context) {
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}


    @Given("The user opens DS Algo portal link")
    public void openDsAlgoportal() {
    	/*webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		testContext = context;*/
    	homePage.navigateTo_HomePage();
    }


    @Then("The user should land in DS Algo portal page")
    public void LandingonDsAlgoportal() {
    }

    @When("The user clicks the \"Get Started\" button")
    public void ClickingGetStartedButton() {
    	
    }
    
}

