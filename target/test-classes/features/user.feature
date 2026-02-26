Feature: Get User API

  Scenario: Verify user API
    When I get user with id 2
    Then status code should be 200