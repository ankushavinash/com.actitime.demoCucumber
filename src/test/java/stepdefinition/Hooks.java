package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setup(){
		System.out.println("Executed Before Scenario");
	}
	
	/*@After
	public void tearDown() {
		System.out.println("Executed After Scenario");
	}*/
	
	@After
	public void tearDown(Scenario scenario) {
	if (scenario.isFailed()) 
	{
		EventFiringWebDriver efwd = new EventFiringWebDriver(new LoginStepDefinition().driver);
		File sourceFile = efwd.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("./loginScreenShot.png"));
		} catch (IOException e) {
			
		}
	}
	}
}
