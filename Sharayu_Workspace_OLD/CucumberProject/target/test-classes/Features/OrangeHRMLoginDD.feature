Feature: Login To OrangeHRM

  Scenario: Validate Login Functionality of OrangeHRM application
    Given browser launch
    Then verify title of login page
    When enters "Admin" and "admin123"
    And login button is clicked
    Then validate home page title
