Feature: Get single user

#  @Gorest

#  Scenario Outline: Get single user with valid parameter
#    Given Get single user with registered <id>
#    When Send get single user post
#    Then Status code should be 200 OK
#    And Response body should be <id> user
#    And Validate get single json schema
#    Examples:
#      | id    |
#      | 29953 |
#      | 29907 |


#  Scenario Outline: Get single user with invalid id
#    Given Get single user with invalid "<page>"
#    When Send get single user post page
#    Then Status code should be 404 Not Found
#    And Response body should be "Resource not found" as error message
#    And Validate get single json schema invalid
#    Examples:
#      | id |
#      | 20 |
#      | 22 |
#      | 21 |
