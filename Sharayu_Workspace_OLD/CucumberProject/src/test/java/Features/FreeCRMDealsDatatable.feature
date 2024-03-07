Feature: Create Deals of Free CRM Application

  Scenario: Create Deals of Free CRM Application Scenario
    Given launch browser
    When user enters username and password
      | sudipadas1988@yahoo.in | Sudipa@12 |
    Then user clicks on login button
    And validates title of home page
    And clicks on deals link and add new button
    Then enters title and probability and amount
      | deals title | 20 | 20 |
    Then save button is clicked
    