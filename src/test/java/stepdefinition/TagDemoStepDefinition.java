package stepdefinition;

import cucumber.api.java.en.Given;

public class TagDemoStepDefinition {

	@Given("^Executing scenario_one$")
	public void executing_scenario_one() throws Throwable {
		System.out.println("Executed Scenario 1");
	}

	@Given("^Executing scenario_two$")
	public void executing_scenario_two() throws Throwable {
		System.out.println("Executed Scenario 2");
	}

	@Given("^Executing scenario_three$")
	public void executing_scenario_three() throws Throwable {
		System.out.println("Executed Scenario 3");
	}

	@Given("^Executing scenario_four$")
	public void executing_scenario_four() throws Throwable {
		System.out.println("Executed Scenario 4");
	}

	@Given("^Executing scenario_five$")
	public void executing_scenario_five() throws Throwable {
		System.out.println("Executed Scenario 5");
	}

}
