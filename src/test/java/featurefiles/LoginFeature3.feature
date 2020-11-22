Feature: Testing the Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched
And the application is loaded


Scenario: Testing the Login feature with valid admin credentials
When the user enters the valid credendials username and password
	|username|password|
	|admin|manager|
	|trainee|trainee|
And the user click on the login Button
Then dashboard should be displayed