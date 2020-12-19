@CountryReader
Feature: Read countries
  @CreateCountry
  Scenario Outline: create a country
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-countries" and creates country using "<idJson>" and "<nameJson>"
    Examples: create country
      |idJson|nameJson|
      |name|France|
  Scenario: read all countries
    Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    And user saves the countries to correspondent files
    Then user validates the countries
  Scenario Outline:  delete countries
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"
    Examples: multiple countries
      |endPoint                                |id    |
      |https://www.gmibank.com/api/tp-countries|/57080|
