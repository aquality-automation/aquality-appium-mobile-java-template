Feature: Demo

  @demo
  Scenario: I try to login with invalid credentials
    Given I open 'Login Screen' view
    Then Login Screen is opened
    When I log in with data:
      | Username | MyUsername      |
      | Password | InVal1dPa$$w0rd |
    Then 'Invalid login credentials, please try again' alert appears