Feature: Get list user post

  @Gorest
  Scenario Outline: Delete user with valid id
    Given Delete single user with valid and existing parameter <id>
    When Send delete single user post
    Then Status code should be 204 No Content
    Examples:
      | id    |
      | 29904 |
      | 29903 |

  @Gorest
  Scenario Outline: Delete user with invalid parameter id
    Given Delete single user with invalid "<id>"
    When Send delete single user post
    Then Status code should be 404 Not Found
    And Response body should be "Resource not found" as error message
    Examples:
      | id     |
      | gregeg |
      | gergg  |