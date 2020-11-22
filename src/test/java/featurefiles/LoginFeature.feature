Feature: Testing the Login feature of Actitime Application

Background: 
Given the browser is launched
And the application is loaded


Scenario: Testing the Login feature with valid data
When the user enters the valid username
And the user enters the valid password
And the user click on the login Button
Then dashboard should be displayed

