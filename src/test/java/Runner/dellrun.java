package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Feature/dell.feature"},
plugin = {"json:target/cucumber.json"},
glue = "Stepdefinition")//tags = {"@Sanity"})
public class dellrun extends AbstractTestNGCucumberTests{

}
