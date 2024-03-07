Feature: Home Page Test of OrangeHRM Application

  Scenario Outline: Validate Home Page Test
    Given launch browser
    Then verify loginpage title
    When "<username>" and "<password>"
    Then check admin text
    Then validate the url of home page
    Then mouse hover on admin and user mgmt link
    And click on user link and add button

    Examples: 
      | username | password |
      | Admin    | admin123 |
