Feature: Login Test
  Verify that user can not login with invalid credentials

  Scenario: Verify Welcome message
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully


  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primefivetest@yahoo.com"
    And I enter password "abc123"
    And I click on login button
    Then I should login successfully

  Scenario : Verify invalid credential login message
    Given I am on homepage
    When I click on login link
    And I enter email "abcd123@gmail.com"
    And I enter password "xyz123"
    And I click on login button
    Then I should see the error message "errorMessage"
