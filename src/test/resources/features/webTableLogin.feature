Feature: User should be able to logib using correct credentials


  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks login button
    Then user should verify that url contains "orders"


  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test" and password "Tester" and click login
    Then user should verify that url contains "orders"



#  TC #: Login scenario
#  1- Open a chrome browser
#  2- Go to: https://web-table-2.cydeo.com/login
#  3- Enter username: Test
#  4- Enter password: Tester
#  5- Verify URL:
#  Expected: URL should end with “orders”