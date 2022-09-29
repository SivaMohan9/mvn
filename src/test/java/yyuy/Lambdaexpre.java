package yyuy;
import org.junit.Assert;
import cucumber.api.java8.En;

public class Lambdaexpre implements En {
	
      public Integer sum=0;
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
