Feature: Free CRM Contacts Page Test

  Scenario Outline: Validate Contacts Page Test
    Given browser is launched
    And user validates login page title
    When user enters "<username>" and "<password>"
    Then user clicked on contacts link
    And clicks on new button
    Then enters "<firstname>" and "<lastname>"
    And "<email>" is entered
    Then clicks on save button

    Examples: 
      | username               | password  | firstname | lastname | email           |
      | sudipadas1988@yahoo.in | Sudipa@12 | Neha      | Sharma   | neha@gmail.com  |
      | sudipadas1988@yahoo.in | Sudipa@12 | Radha     | Shah     | radha@gmail.com |
