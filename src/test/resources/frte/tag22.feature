Feature: Running Cucumber testing

  @sanity
  Scenario: sample 1
    Given The user application
    When Enter the username credentials for login
    Then Verify the successful login

  @regression
  Scenario: sample 2
    Given The user application
    When edit the profile
    Then Verify the address

  @sanity @regression
  Scenario: sample 3
    Given The user application
    When Enter the username credentials for login
    Then Verify the successful login
