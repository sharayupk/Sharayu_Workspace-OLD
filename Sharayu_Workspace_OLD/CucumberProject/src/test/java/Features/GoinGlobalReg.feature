Feature: GoinGlobal Registration Form

  Scenario Outline: Register user on GoinGlobal Site
    Given browser is launched
    When register form is opened
    When I enters name as "<name>" and phone as"<phone>"
    Then I enters organization as"<organization>" and department as "<department>" and title as "<title>"
    And I enters email as "<email>" and comments as "<comments>"
    And I clicks on notrobot box and submit button

    Examples: 
      | name  | phone      | organization | department | title    | email           | comments |
      | Raj   | 7865497657 | J.S.P.M      | IT         | Master   | raj@gmail.com   | Good     |
      | Sneha | 8365445766 | D.Y Patil    | CS         | Bachelor | sneha@gmail.com | Good     |
