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
@GetCEOName
Feature: This feature is to get the CEO Name from the OrangeHRM app
Scenario Outline: This test is to verify the CEO name
    Given the user is logged in successfully and in on Home Page
    When the user clicks on the directory option from the Menu bar
    And the user selects the job title as "CEO" from the drop down
    And clicks the search button
    Then the user should see the CEO name as "<CEO_Name>"

    Examples: 
      |CEO_Name|
      |John Smith|
