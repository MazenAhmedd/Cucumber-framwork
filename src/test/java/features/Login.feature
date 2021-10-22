Feature: Application Login feature

#  Background:
#    Given validate the browser
#    When Browser is triggered
#    Then  check if browser is displayed

  @SmokeTest
  Scenario:  Home page default login with invalid data
    Given User is on NetBanking landing page
    When User login into application with "jin" and "1234"
    Then Home page is opened
    And Cards  displayed are "true"

  @webTest
  Scenario:  web test case
    Given User is on NetBanking landing page
    When User login into application with "john" and "4321"
    Then Home page is opened
    And Cards  displayed are "false"

        #using data table to pass multiple parameters
  @RegTest @SmokeTest
  Scenario:  Home page default login with data table
    Given User is on NetBanking landing page
    When User sign up with following details
      | jenny | abcd | john@abds.com | Australia | 3242353 |
    Then Home page is opened
    And Cards  displayed are "false"

  @mobileTest
  Scenario: mobile test case
    Given User is on NetBanking landing page
    When User login into application with "jin" and "1234"
    Then Home page is opened
    And Cards  displayed are "true"

    #Parametrization using Example keyword
  @RegTest
  Scenario Outline:  Home page default login with Scenario outline and Examples
    Given User is on NetBanking landing page
    When User login in to application with <Username> and <Password>
    Then Home page is opened
    And Cards  displayed are "true"
    Examples:
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |