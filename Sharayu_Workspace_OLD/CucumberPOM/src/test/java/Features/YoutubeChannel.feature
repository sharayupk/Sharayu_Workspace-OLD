Feature: Validation of Youtube Channel

  Scenario: Youtube Channel Validation
    Given open chrome browser with url
    When search selenium tutorial
    And click on channel name
    Then validate channel name
