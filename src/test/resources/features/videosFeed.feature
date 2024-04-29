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
@tag
Feature: validate Videos Feed
  @Warriors
  Scenario: Count total number of Videos Feeds and count the videos feeds those are present in the page >= 3d
    Given launch warriors "https://www.nba.com/warriors" in "chrome" browser
    When user in on the homePage
    And click on New& Features from menu
    Then Get the Count Of Video Feeds
    And Count the Video feeds which are more than3 days

