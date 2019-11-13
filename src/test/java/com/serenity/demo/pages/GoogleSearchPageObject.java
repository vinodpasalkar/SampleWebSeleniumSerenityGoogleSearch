package com.serenity.demo.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GoogleSearchPageObject extends PageObject {


	@FindBy(name="q")
	public WebElementFacade txtboxGoogleSearch;

	@FindBy(css="h3")
	public WebElementFacade lnkGoogleSearchResults_FirstRecord;

	@FindBy(name="btnK")
	public WebElementFacade btnSearch;

	@FindBy(xpath="//input[@data-testid = \"screen.login.input.username\"]")
	public WebElementFacade userName;

	@FindBy(xpath="//input[@data-testid = \"screen.login.input.password\"]")
	public WebElementFacade password;

	@FindBy(xpath="//div[@data-testid = \"screen.login.action.login\"]")
	public WebElementFacade login;

	@FindBy(xpath="//div[@data-testid = \"title\"]")
	public WebElementFacade myHome;

	public void typeSearchText(String sSearchTerm){
		txtboxGoogleSearch.type(sSearchTerm);
//		txtboxGoogleSearch.sendKeys("\u2212");
	}

	public  String getFirstRecordFromSearchResults(){
		waitABit(3000);
		System.out.println(lnkGoogleSearchResults_FirstRecord.getText());
		return lnkGoogleSearchResults_FirstRecord.getText();
	}

	public void pressEnterToSearch(){
		btnSearch.click();
	}

	public void openURL(String url){
		openAt(url);
	}

	public void loginRNApp(){
		userName.type("osa-hl-hub2");
		password.type("Test1234");
		login.click();
	}

	public void checkDashboard(){
		waitABit(5000);
		if(myHome.isCurrentlyVisible())
			System.out.println("Login successful");
		else
			System.out.println("Login failed");
	}

}
	
