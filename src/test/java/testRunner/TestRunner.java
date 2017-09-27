package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;



import java.util.Map;
import cucumber.api.junit.Cucumber;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/featureFiles/SearchData.feature" },
//		features = { "src/test/resources/featureFiles/CreateCustomer.feature" },
		format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
		glue = { "webDriver", "stepDefinition", "testRunner" },
		tags = { "~@ignore"},
		plugin = {"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	public static Map<String, String> config;
	public static Scenario scenario;
}
