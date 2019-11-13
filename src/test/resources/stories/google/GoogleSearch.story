Meta:

Narrative:
As a user
I should be able to search in google
So That I can get answer to my question

Scenario: Google should display search results page when I enter a Search Term
Meta:
@search

Given user is on Google Search Page
When the user searches for 'Web Automation'
Then search results page should display 'Website Automation Platform | Automation Tools at Any Scale'


Scenario: Login RN App
Meta:
@login

Given I launch the web app
When I login with my credentials
Then I should see the dashboard