Feature: Put Update User

  @Gorest
  Scenario: Put update user with valid json and parameter id and token
    Given Put update user with valid json and parameter id 2098067 and valid token
    When Send put update user
    Then Status code should be 200 OK
    And Response body id should be id 2098067
    And Validate post create user with valid json and parameter id and valid token json schema

  @Gorest
  Scenario: Get list user with invalid json and valid parameter id and valid token
    Given Get list user with invalid json and valid parameter id 2098067 and valid token
    When Send put update user
    Then Status code should be 400 Bad Request
    And Response body message should be message "Error occurred while parsing request parameters"
    And Validate post create user with invalid json and valid parameter id and valid token json schema

  @Gorest
  Scenario: Get list user with valid json and parameter id and invalid token
    Given Get list user with valid json and parameter id 2098067 and invalid token
    When Send put update user
    Then Status code should be 401 Unauthorized
    And Response body message should be message "Invalid token"
    And Validate get list user with valid json and parameter id and invalid token json schema

  @Gorest
  Scenario: Get list user with valid json and  non registered id and valid token
    Given Get list user with valid json and  non registered id 1 and valid token
    When Send put update user
    Then Status code should be 404 Not Found
    And Response body message should be message "Resource not found"
    And Validate get list resources user with valid json and  non registered id and valid token schema

  @Gorest
  Scenario: Get list user with invalid json and non registered id and valid token
    Given Get list user with invalid json and non registered id 1 and valid token
    When Send put update user
    Then Status code should be 404 Not Found
    And Response body message should be message "Resource not found"
    And Validate get list resources user with invalid json and non registered id and valid token schema