#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@timesheets
Feature: This feature is to get pending timesheet
Scenario Outline: This test is to verify the pending timesheet
    Given the user is on the homepage
    When the user clicks on the time option from the menu
 		And the user enters the name as "John Smith"
    And clicks on the view button 
    Then the user should see the message as "<message>"

    Examples: 
      |message|
      |No TimeSheets Found|