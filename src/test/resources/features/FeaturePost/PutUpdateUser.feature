Feature: Put Update User

  @Gorest
  Scenario: Update valid user
    Given Put update user with valid parameter 30079 as id and json with auth token
    When Send put update user parameter with json
    Then Status code should be 200 OK
    And Validate put update user resources json schema

  @Gorest
  Scenario: Update user without inputting title
    Given Put update user with valid parameter 30079 as id and not inputting title
    When Send put update user parameter with json
    Then Status code should be 200 OK
    And Validate put update user resources json schema
