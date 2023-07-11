Feature: Get Single User
  @Gorest
  Scenario: Get single user with valid parameter id and token
    Given Get single user with valid parameter id 2146830 and token
    When Send get single users
    Then Status code should be 200 OK
    And Response body id should be id 2146830
    And Validate get single user with valid parameter id and valid token json schema

  @Gorest
  Scenario: Get single user with non registered parameter id and valid token
    Given Get single user with non registered parameter id 1 and valid token
    When Send get single users
    Then Status code should be 404 Not Found
    And Response body message should be message "Resource not found"
    And Validate get single user with non registered parameter id and valid token json schema

  @Gorest
  Scenario: Get single user with valid parameter id and invalid token
    Given Get single user with valid parameter id 2146830 and invalid token
    When Send get single users
    Then Status code should be 401 Unauthorized
    And Response body message should be message "Invalid token"
    And Validate get single user with valid parameter id and invalid token json schema

  @Gorest
  Scenario: Get single user with invalid parameter id and valid token
    Given Get single user with invalid parameter id "xyz" and valid token
    When Send get single users
    Then Status code should be 400 Bad Request
