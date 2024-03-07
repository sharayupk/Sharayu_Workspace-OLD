Feature: Free CRM Home Page Test

  Scenario: Validate Home Page Test
    Given user launches browser
    And validates login page title
    When user logs into the application
    Then verifies home page title
    And checks if username is displayed
    Then user clicks on contacts link
    
    
