Feature: Testing the Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched
And the application is loaded


Scenario Outline: Testing the Login feature with valid admin credentials
When the user enters the credentials as "<username>" and "<password>"

Examples:
|username|password|
|admin|manager|
|trainee|trainee|