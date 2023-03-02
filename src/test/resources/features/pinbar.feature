@login
Feature: Users learn how to use the pinbar

  Background: User is already in the log in page
   # Given the user is on the login page
    Given the user is on the home page "https://qa.fleetapps.io/user/login"
    #When the user logged in with username as "user50" and password as "UserUser123"



  @wip
  Scenario: Verify how to use pinbar
    Given the user logged in as "sales manager"
    #Given the user is on the login page "https://qa.fleetapps.io/user/login"
    #When the user logged in with username as "user50" and password as "UserUser123"
    And the user on the page "https://qa.fleetapps.io/"
    And the user can click on the message Learn how to use this space
    Then the user should see 2 messages "How To Use Pinbar" and "Use pin icon on the right top corner of page to create  fast access link in the pinbar"

#
#  @scenarioOutline
#    Examples: users can use usernames and password as
#      | username           | password    |
#      | user50             | UserUser123 |
#      | salesmahager105    |             |
#      | storemanager55     |             |


  @wip
  Scenario: Verify user can see image on the pinbar page
    Given the user logged in as "sales manager"
    #Given the user is on the login page "https://qa.fleetapps.io/user/login"
    #When the user logged in with username as "user50" and password as "UserUser123"
    And the user on the page "https://qa.fleetapps.io/"
    And the user can click on the message Learn how to use this space
    Then the user should see 2 image "How To Use Pinbar" and "Use pin icon on the right top corner of page to create  fast access link in the pinbar"
