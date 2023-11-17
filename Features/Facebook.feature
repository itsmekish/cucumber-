Feature: validate the fields in Login page
Background: User is on faceBook Url
Given browser is launched
Then User loads facebook url


Scenario: checking the user Login fileds
Given user enter Username and password
Then user clicks login button 

Scenario:  checking the forgot password

Given user Clicks Forgot password
When user enters valid data 
Then Check user successfully resets the password

Scenario: Checking the create new Account 

 Given I am on the Facebook homepage
    When I click on the "Create New Account" button
    And I fill in the required fields with unique data
    And I click on the "Sign Up" button
    Then I should be redirected to the Facebook homepage