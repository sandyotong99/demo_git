Feature: Delete User
  @Gorest
  Scenario: Delete user with valid parameter id and valid token
    Given Delete user with valid parameter id 2146831 and valid token
    When Send delete user
    Then Status code should be 204 No Content

  @Gorest
  Scenario: Delete user with non registered id and valid token
    Given Delete user with non registered id 1 and valid token
    When Send delete user
    Then Status code should be 404 Not Found

  @Gorest
  Scenario: Delete user with valid parameter id 2146887 and invalid token
    Given Delete user with valid parameter id 2146887 and invalid token
    When Send delete user
    Then Status code should be 401 Unauthorized
    And Response body message should be message "Invalid token"
    And Validate delete user with valid parameter id and invalid token json schema