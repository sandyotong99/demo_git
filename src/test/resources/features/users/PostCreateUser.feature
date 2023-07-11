Feature: Post Create User

  @Gorest
  Scenario: Post create user with valid json and path and token
    Given Post create user with valid json and path "users" and token
    When Send post create user
    Then Status code should be 201 Created
    And Validate post create user with valid json and path and valid token json schema

  @Gorest
  Scenario: Post create user with valid json and path and invalid token
    Given Post create user with valid json and path "users" and invalid token
    When Send post create user
    Then Status code should be 401 Unauthorized
    And Response body message should be message "Invalid token"
    And Validate post create user with valid json and path and invalid token json schema

  @Gorest
  Scenario: Post create user with valid json and invalid path and valid token
    Given Post create user with valid json and invalid path "uussers" and valid token
    When Send post create user
    Then Status code should be 404 Not Found

  @Gorest
  Scenario: Post create user with invalid json and valid path and valid token
    Given Post create user with invalid json and valid path "users" and valid token
    When Send post create user
    Then Status code should be 400 Bad Request

  @Gorest
  Scenario: Post create user with invalid json and invalid path and valid token
    Given Post Create user with invalid json and invalid path "uussers" and valid token
    When Send post create user
    Then Status code should be 404 Not Found



