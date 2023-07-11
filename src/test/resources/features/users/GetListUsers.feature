Feature: Get List Users
  @Gorest
  Scenario: Get list users with valid path and token
    Given Get list users with valid path "users" and token
    When Send get lists users
    Then Status code should be 200 OK
    And Validate get list users with valid path and valid token json schema

  @Gorest
  Scenario: Get list users with valid path and invalid token
    Given Get list users with valid path "users" and invalid token
    When Send get lists users
    Then Status code should be 401 Unauthorized
    And Response body message should be message "Invalid token"
    And Validate get list users with valid path and invalid token json schema

  @Gorest
  Scenario: Get list users with invalid path and valid token
    Given Get list users with invalid path "uusseerrss" and valid token
    When Send get lists users
    Then Status code should be 404 Not Found

  @Gorest
  Scenario: Get list users with invalid path and token
    Given Get list users with invalid path "uusseerrss" and token
    When Send get lists users
    Then Status code should be 404 Not Found