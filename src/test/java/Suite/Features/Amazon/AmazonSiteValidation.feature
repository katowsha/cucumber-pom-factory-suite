Feature: Microsoft site test validation

  @AmazonTest
  Scenario: Amazon flow validation with fake api data
    Given I navigate to amazon site
    When Im on landing page
    Then I navigate to new customer form
    When I get fake data from api response
    Then I fill the name and email fields
    When I navigate to condition of use link
    And I search for "Echo" on search bar
    Then I should navigate to Echo Support
    And Validate the elements on support section
