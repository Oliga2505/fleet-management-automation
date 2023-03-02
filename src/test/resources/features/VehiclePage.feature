@login
Feature: Users should see car info icons from the Vehicle page

  Background: User is already in the log in page
   # Given the user is on the login page
    Given the user is on the home page "https://qa.fleetapps.io/user/login"
    #When the user logged in with username as "user50" and password as "UserUser123"




  @scenarioOutline
  Scenario Outline: Verify how to use pinbar
    Given the user logged in as user "salesmanager105"
    #Given the user is on the login page "https://qa.fleetapps.io/user/login"
    #When the user logged in with username as "user50" and password as "UserUser123"
    And the user can click on the message Fleet
    And the user can click on the Vehicle
    And the user can click on the three dots
    Then the user should see three icons view, edit, delete


    @scenarioOutline
    Examples: users can use usernames and password as
      | username           | password    |
      | user50             | UserUser123 |
      | salesmanager105    |             |
      | storemanager55     |             |



