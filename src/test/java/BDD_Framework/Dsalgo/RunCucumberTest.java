package BDD_Framework.Dsalgo;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("BDD_Framework/Dsalgo")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/BDD_Framework/DSalgo",
				glue= {"stepdefinition"},
				dryRun = false,
				monochrome = true, 
				plugin = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"})
				

public class RunCucumberTest {

	}
	

