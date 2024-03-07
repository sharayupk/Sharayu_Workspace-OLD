Feature: Calculate Billing Amount

  Scenario Outline: Billing Amount
    Given user is on billing page
    When user enters biling amount "<billingAmount>"
    When user enters tax amount "<taxAmount>"
    And user clicks on calculate button
    Then it gives final amount "<finalAmount>"

    Examples: 
      | billingAmount | taxAmount | finalAmount |
      |            10 |       100 |         110 |
      |            50 |        50 |         100 |
      |           100 |      50.0 |       150.0 |
