Feature: Demo

  @demo
  Scenario: I try to login with invalid credentials
    Given I open 'Login Screen' view
    Then Login Screen is opened
    When I log in with data:
      | Username | MyUsername      |
      | Password | InVal1dPa$$w0rd |
    Then 'Invalid login credentials, please try again' alert appears

  @demo
  Scenario: ScenarioContext demo
    Given I store '2' as 'value1'
    And I store '3' as 'value2'
    Then I add 'value1' to 'value2' and '5' as a result
