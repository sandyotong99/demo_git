Feature: Post new user


  @Gorest
  Scenario: Post new user with valid data
    Given Post new user with valid parameter
    When Send post new user parameter
    Then Status code should be 201 Created
    And Validate post create user resources json schema
  @Gorest
  Scenario: Post new user without inputting body
    Given Post new user without inputting body
    When Send post new user parameter
    Then Status code should be 422 Unprocessable Entity
    And Validate post without inputting body json data schema

  @Gorest
  Scenario: Post new user without inputting user_id
    Given Post new user without inputting user_id
    When Send post new user parameter
    Then Status code should be 422 Unprocessable Entity
    And Validate post without inputting User_id json data schema
  @Gorest
  Scenario: Post new user without inputting title
    Given Post new user without inputting title
    When Send post new user parameter
    Then Status code should be 422 Unprocessable Entity
    And Validate post without inputting title json data schema