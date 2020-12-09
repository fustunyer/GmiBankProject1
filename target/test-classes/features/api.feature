@AllCustomerApi
Feature: Gmi Bank All Customer Info

  Scenario: Read and validate all customer data
    Given user read all customer and sets response using to api end point "https://www.gmibank.com/api/tp-customers"
    And user deserialization customer data json to java pojo
    Then user validates all data