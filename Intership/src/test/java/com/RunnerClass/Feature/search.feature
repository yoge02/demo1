Feature: Validate customer section on Invoice Manager application

  Scenario: Validate cutomer button on Invoice Manager homepage
    Given I am on homepage of Invoice Manager application
    When I click on Customers
    Then I should able to List Customers and Add customer, import customers by csv
