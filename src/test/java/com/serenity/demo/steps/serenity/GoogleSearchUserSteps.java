package com.serenity.demo.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.serenity.demo.pages.GoogleSearchPageObject;
import net.thucydides.core.annotations.ManagedPages;

import net.thucydides.core.annotations.Step;

public class GoogleSearchUserSteps {


	@ManagedPages
	GoogleSearchPageObject googleSearchPageObject;

	@Step
	public void opensGooglePage() {
		googleSearchPageObject.openURL("http://www.google.com");
	}

	@Step
	public void searchWithText(String sSearchTerm){
		googleSearchPageObject.typeSearchText(sSearchTerm);
		googleSearchPageObject.pressEnterToSearch();
	}

	@Step
	public void shouldSeeSearchResults(String sExpectedSearchResults){
		assertThat(googleSearchPageObject.getFirstRecordFromSearchResults(), is(equalToIgnoringCase(sExpectedSearchResults)));
	}

	@Step
	public void launchRNApp(){
		googleSearchPageObject.openURL("https://staging.rnw-my.devhh.net/index.html#/");
	}

	@Step
	public void loginRNApp(){
		googleSearchPageObject.loginRNApp();
	}

	@Step
	public void checkDashboard(){
		googleSearchPageObject.checkDashboard();
	}

}