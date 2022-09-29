package yyuy;

import cucumber.api.java8.En;
import org.junit.Assert;
public class Runnerclass implements En {
	public void mysteps()
    {
	
	Given("^I add (\\d+) and (\\d+)$", (Integer arg1, Integer arg2) -> {
		System.out.println("Add two numbers");

	});

	Then("^I verify that the sum is (\\d+)$", (Integer arg1) -> {
		System.out.println("Sum");

	});
    }
}
