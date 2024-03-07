Feature: Demo Application Test

  Scenario: Register an user in Demo Application
    Given chrome is launched
    And application is opened
    When user fills fname and lname
    And user enters address and email and phone
    Then user clicks on gender and hobbies
    Then user selects languages and skills and country
    And enters country
    Then selects year and month and day
    And fills password and conpassword
    Then clicks on submit button
    Then validates title of the page
