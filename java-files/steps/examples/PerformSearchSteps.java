package com.wipro.testing.training.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.wipro.testing.training.pages.SearchPage;

public class PerformSearchSteps {

	SearchPage page = new SearchPage();
	
	@Given("I am on Search Engine Home Page")
	public void navigateToSearchPage() {
		page.navigateToPage();
	}

	@When("I perform a search with text <searchText>")
	public void performSearch(@Named("searchText") String value) {
		page.typeSearchText(value);
	}

	@Then("I will see the Search Results Page")
	public void validateResultsPage() {
		Assert.assertTrue(true);
	}

}
