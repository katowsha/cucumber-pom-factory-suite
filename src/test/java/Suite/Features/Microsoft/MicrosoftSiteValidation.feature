Feature: Microsoft site test validation

  @MicrosoftTest
  Scenario: Microsoft flow validation
    Given I navigate to microsoft site
    When Im on landing page
    Then I should see nav elements
    When I Navigate to "Windows" link
    And I click on windows menu
    Then I should see elements on drop down
    When I search visual studio product
    Then I see three different products
    When I click on the first product
    Then I should see same price on detail section
    When I add this item to the shopping cart
    And I click navigate to shopping cart section
    Then I should see same price on shopping cart section
    When I set twenty products to buy
    Then I should see a correct amount
