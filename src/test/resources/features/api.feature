@api
Feature: Gmi Bank Api Test
  Scenario: Read all customer
    Given user go to api end point "https://www.gmibank.com/api/tp-customers"
    And read all customer and sets response