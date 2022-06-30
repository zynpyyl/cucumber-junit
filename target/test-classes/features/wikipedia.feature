
Feature: Wikipedia Search Functionality Title Verification

  Scenario: Title verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario: Header verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Image header verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

  @scenarioOutline
  Scenario Outline: Title verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values that we are going to use in this scenario
      | searchValue     | expectedTitle   | expectedMainHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         |
      | Bob Marley      | Bob Marley      | Bob Marley         |
      | Bill Gates      | Bill Gates      | Bill Gates         |
      | Chuck Norris    | Chuck Norris    | Chuck Norris       |
      | Anthony Hopkins | Anthony Hopkins | Anthony Hopkins    |
      | Kate Winslet    | Kate Winslet    | Kate Winslet       |
      | Marie Curie     | Marie Curie     | Marie Curie        |
      | Lady Gaga       | Lady Gaga       | Lady Gaga          |



#    TC#2: Wikipedia Search Functionality Title Verification
#    1. User is on Wikipedia home page
#    2. User types Steve Jobs in the wiki search box
#    3. User clicks wiki search button
#    4. User sees Steve Jobs is in the wiki title
#    Note: Follow POM
#    TC#3: Wikipedia Search Functionality Header Verification
#    1. User is on Wikipedia home page
#    2. User types Steve Jobs in the wiki search box
#    3. User clicks wiki search button
#    4. User sees Steve Jobs is in the main header
#    Note: Follow POM
#    TC#4: Wikipedia Search Functionality Image Header Verification
#    1. User is on Wikipedia home page
#    2. User types Steve Jobs in the wiki search box
#    3. User clicks wiki search button
#    4. User sees Steve Jobs is in the image header
#    Note: Follow POM