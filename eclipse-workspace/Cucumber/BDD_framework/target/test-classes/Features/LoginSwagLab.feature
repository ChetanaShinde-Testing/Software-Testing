Feature: Login page 
Scenario: Check login with valid credentials 
Given User is on login page
When User enter valid username and password
And click on OK button
Then Login successful and user redirect to home page