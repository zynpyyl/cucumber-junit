
Feature: Examples of Cucumber data table implementations



  Scenario: List of fruits I like
    Then user should see fruits I like
      | kiwi        |
      | banana      |
      | grape       |
      | pomegranate |
      | cucumber    |
      | mango       |
      | orange      |

  @zynp
  Scenario: User should be able to see all 12 months in months dropdown

    Given User is on the dropdowns page of practice tool
    Then User should see all months info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |