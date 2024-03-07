Feature: User Registration in Mercury Tours Site

  #DataTable for User Registration using raw()
  Scenario: Single User Registration
    Given I have valid set of data and access to Registration Page
    When Registration Page is displayed
    Then I enter valid data on page
      | FirstName   | Aditya           |
      | LastName    | Roy              |
      | Phone       |       9789087654 |
      | Email       | aditya@gmail.com |
      | UserName    | aditya12         |
      | Password    | aditya@123       |
      | ConfirmPass | aditya@123       |
      
    Then click on submit button
    And Thank you for Registering: should be displayed
    Then click on signoff
    And close the browser
