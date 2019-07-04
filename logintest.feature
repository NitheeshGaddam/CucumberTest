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
Feature: Verify Login Functionality with multiple users


 Scenario Outline: Verify Login Functionality of facebook
    Given enter '<username>' and '<password>'
    When click on login
    Then verify login is not successful

    Examples: 
      | username  					| password 		 |
      | dummy@gmail.com	 		| testing123 	 |
      | rummy@gmail.com			| testing143   |
