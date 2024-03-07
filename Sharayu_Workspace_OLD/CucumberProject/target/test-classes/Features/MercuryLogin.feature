Feature: Login To Mercury Tours Application

  #Without Examples Keyword
  #Scenario: Validate Login Functionality of Mercury Tours Application
  #Given user is on login page
  #Then validate login page title
  #When user set "mercury" and "mercury"
  #And clicks on signin button
  #Then verifies home page title
  
  
  #Without Examples Keyword
  Scenario Outline: Validate Login Functionality of Mercury Tours Application
    Given user is on login page
    Then validate login page title
    When user set "<username>" and "<password>"
    And clicks on signin button
    Then verifies home page title

    Examples: 
      | username | password |
      | mercury  | mercury  |
      | mer      | mer      |
