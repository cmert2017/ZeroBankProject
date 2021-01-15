# Only authorized users should be able to login to the application.

# When user logs in with valid credentials, Account summary page should be displayed.


# Users with wrong username or wrong password should not be able to login.
# Users with blank username or password should also not be able to login.
# When user tries to login with invalid information,
# error message Login and/or password are wrong. should be displayed.
Feature: Only authorized users should be able to login to the application



  Background:


  @positive
  Scenario: login with valid credentials
    Given authorize user is on the login page
    When user enters valid credentials
    Then system displays the account summary page




  Scenario:



  Scenario Outline:
    Examples:
      |  |