Feature: Get list user post

  @Gorest
  Scenario: Get list user post with valid parameter
    Given Get list user post with valid parameter
    When Send get list user
    Then Status code should be 200 OK
    And Validate json schema get list user post

  @Gorest
  Scenario Outline: Get list user post with invalid parameter
    Given Get list user post with invalid parameter "<post>"
    When Send get list user post invalid
    Then Status code should be 404 Not Found

    Examples:
      | post |
      | zzz  |
      | xyz  |



