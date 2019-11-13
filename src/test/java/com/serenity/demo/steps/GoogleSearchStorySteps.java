package com.serenity.demo.steps;

import static org.hamcrest.Matchers.is;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.*;
import com.serenity.demo.steps.serenity.GoogleSearchUserSteps;
import org.jbehave.core.model.ExamplesTable;

import java.util.Map;

public class GoogleSearchStorySteps {


	@Steps
	GoogleSearchUserSteps googleSearchUserSteps;

	@Given("user is on Google Search Page")
	public void givenUserIsOnGoogleSearchPage(){
		googleSearchUserSteps.opensGooglePage();
	}

	@When("the user enters search text")
	public void whenUserEntersSearchText(){
		googleSearchUserSteps.searchWithText("Serenity BDD");
	}

	@Aliases(values={"the user searches for '${1}'"})
	@When("the user enters <Search Text>")
	public void whenUserEntersSearchText1(@Named("Search Text") String sSearchText){
		googleSearchUserSteps.searchWithText(sSearchText);
	}

	@Aliases(values={"search results page should display '${1}'"})
	@Then("search results page should contain <Search Results>")
	public void thenSearchResultsPageShouldContainSearchResults(@Named("Search Results") String sExpectedSearchResults){
		googleSearchUserSteps.shouldSeeSearchResults(sExpectedSearchResults);
	}


	@Given("I launch the web app")
	public void launchRNApp(){
		googleSearchUserSteps.launchRNApp();
	}
	@When("I login with my credentials")
	public void loginRNApp(){
		googleSearchUserSteps.loginRNApp();
	}

	@Then("I should see the dashboard")
	public void checkDashboard(){
		googleSearchUserSteps.checkDashboard();
	}
}
