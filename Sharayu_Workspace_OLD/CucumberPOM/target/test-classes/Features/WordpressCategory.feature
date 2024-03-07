Feature: Wordpress Application

  #Without Examples Keyword and DataTables
  Scenario: Validate Wordpress Application
    Given user get browser
    Then validate login page title
    When user set "admin" and "demo123"
    And login button is clicked
    Then user is on home page
    Then verify that user is logged in
    When all posts tab is clicked
    And click on categories link
    Then name and category and description is entered
    | Category | Uncategorised | Add Category |
    And click add new category button
