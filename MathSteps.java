package com.wipro.testing.training.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class MathSteps extends Steps{

	int x;
	 
	@Given("a variable x with value $value")
	public void givenXValue(@Named("value") int value) {
		x = value;
		System.out.println("A variable x with value " + x);
	}
 
	@When("I multiply x by $value")
	public void whenImultiplyXBy(@Named("value") int value) {
		x = x * value;
		System.out.println("I multiply x by " + value);
	}
 
	@Then("x should equal $value")
	public void thenXshouldBe(@Named("value") int value) {
		System.out.println("Expected: " + value + " ; Result: " + x);
		if (value != x)
			throw new RuntimeException("x is " + x + ", but should be " + value);
	}

}
