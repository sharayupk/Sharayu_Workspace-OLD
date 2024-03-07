Feature: Login to Wordpress Application

  Scenario: Login to Wordpress Application with valid credentials
    Given user is already on login page
    When title of login page is Log In ‹ Wordpress Demo Site at Demo.Center — WordPress
    Then user enters "admin" and "demo123"
    And clicks on login button
    Then user is on home page
