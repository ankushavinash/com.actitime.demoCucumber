package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@Test
	@CucumberOptions(features = "./src/test/java/featurefiles/LoginFeature1.feature", 
					 glue = {"stepdefinition"}, 
					 dryRun = false)
					// tags = {"@SmokeTest,@End2End"})
	public class Runner extends AbstractTestNGCucumberTests {
	
}
