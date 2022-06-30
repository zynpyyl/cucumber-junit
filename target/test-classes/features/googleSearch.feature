
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able
  to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google


  Scenario: Google Search Functionality Title Verification
   Given user is on Google search page
   When  user types apple in the google search box and clicks enter
   Then user sees apple is in the google title


  Scenario: Google Search Functionality Title Verification
    Given user is on Google search page
    When  user types "banana" in the google search box and clicks enter
    Then user sees "banana" is in the google title


  #TC#1: Google Search Functionality Title Verification
  # 1. User is on Google search page
  # 2. User types apple in the google search box and clicks enter
  # 3. User sees apple is in the google title
  # Note: Follow POM
